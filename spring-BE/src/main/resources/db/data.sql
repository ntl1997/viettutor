CREATE DATABASE viettutor
Go
USE viettutor
go
-- Drop and Create Users table
IF OBJECT_ID('[dbo].[Users]', 'U') IS NOT NULL DROP TABLE [dbo].[Users]
CREATE TABLE [dbo].[Users] (
    Id INT PRIMARY KEY IDENTITY,
    FullName NVARCHAR(100) NOT NULL,
    Email NVARCHAR(100) UNIQUE NOT NULL,
    PhoneNumber NVARCHAR(20),
    PasswordHash NVARCHAR(255) NOT NULL,
    Role NVARCHAR(20) NOT NULL,
    CreatedAt DATETIME DEFAULT GETDATE()
);
GO

-- Drop and Create Tutors table
IF OBJECT_ID('[dbo].[Tutors]', 'U') IS NOT NULL DROP TABLE [dbo].[Tutors]
CREATE TABLE [dbo].[Tutors] (
    Id INT PRIMARY KEY,
    Gender NVARCHAR(10),
    BirthYear INT,
    ExperienceYears INT,
    AcademicLevel NVARCHAR(100),
    Address NVARCHAR(255),
    Description NVARCHAR(MAX),
    IsVerified BIT DEFAULT 0,
    FOREIGN KEY (Id) REFERENCES Users(Id) ON DELETE CASCADE
);
GO

-- Drop and Create Tutor_Applications table
IF OBJECT_ID('[dbo].[Tutor_Applications]', 'U') IS NOT NULL DROP TABLE [dbo].[Tutor_Applications]
CREATE TABLE [dbo].[Tutor_Applications] (
    Id INT PRIMARY KEY IDENTITY,
    TutorId INT NOT NULL,
    CVUrl NVARCHAR(255),
    Status NVARCHAR(20) DEFAULT 'pending',
    SubmittedAt DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (TutorId) REFERENCES Tutors(Id) ON DELETE CASCADE
);
GO

-- Drop and Create Subjects table
IF OBJECT_ID('[dbo].[Subjects]', 'U') IS NOT NULL DROP TABLE [dbo].[Subjects]
CREATE TABLE [dbo].[Subjects] (
    Id INT PRIMARY KEY IDENTITY,
    Name NVARCHAR(100) NOT NULL
);
GO

-- Drop and Create Levels table
IF OBJECT_ID('[dbo].[Levels]', 'U') IS NOT NULL DROP TABLE [dbo].[Levels]
CREATE TABLE [dbo].[Levels] (
    Id INT PRIMARY KEY IDENTITY,
    Name NVARCHAR(100) NOT NULL
);
GO

-- Drop and Create Locations table
IF OBJECT_ID('[dbo].[Locations]', 'U') IS NOT NULL DROP TABLE [dbo].[Locations]
CREATE TABLE [dbo].[Locations] (
    Id INT PRIMARY KEY IDENTITY,
    Name NVARCHAR(100) NOT NULL
);
GO

-- Drop and Create Classes table
IF OBJECT_ID('[dbo].[Classes]', 'U') IS NOT NULL DROP TABLE [dbo].[Classes]
CREATE TABLE [dbo].[Classes] (
    Id INT PRIMARY KEY IDENTITY,
    PostedBy INT NOT NULL,
    SubjectId INT NOT NULL,
    LevelId INT NOT NULL,
    LocationId INT,
    NumberOfStudents INT DEFAULT 1,
    Schedule NVARCHAR(255),
    LearningMode NVARCHAR(20),
    Requirements NVARCHAR(MAX),
    PreferredTutorId INT NULL,
    Status NVARCHAR(20) DEFAULT 'pending',
    CreatedAt DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (PostedBy) REFERENCES Users(Id) ON DELETE CASCADE,
    FOREIGN KEY (SubjectId) REFERENCES Subjects(Id),
    FOREIGN KEY (LevelId) REFERENCES Levels(Id),
    FOREIGN KEY (LocationId) REFERENCES Locations(Id),
    FOREIGN KEY (PreferredTutorId) REFERENCES Tutors(Id)
);
GO

-- Drop and Create Class_Approvals table
IF OBJECT_ID('[dbo].[Class_Approvals]', 'U') IS NOT NULL DROP TABLE [dbo].[Class_Approvals]
CREATE TABLE [dbo].[Class_Approvals] (
    Id INT PRIMARY KEY IDENTITY,
    ClassId INT NOT NULL,
    AdminId INT NOT NULL,
    ApprovedAt DATETIME DEFAULT GETDATE(),
    Note NVARCHAR(255),
    FOREIGN KEY (ClassId) REFERENCES Classes(Id) ON DELETE CASCADE,
    FOREIGN KEY (AdminId) REFERENCES Users(Id)
);
GO

-- Drop and Create Tutor_Class_Matches table (no ON DELETE CASCADE to avoid multiple cascade paths)
IF OBJECT_ID('[dbo].[Tutor_Class_Matches]', 'U') IS NOT NULL DROP TABLE [dbo].[Tutor_Class_Matches]
CREATE TABLE [dbo].[Tutor_Class_Matches] (
    Id INT PRIMARY KEY IDENTITY,
    ClassId INT NOT NULL,
    TutorId INT NOT NULL,
    AssignedAt DATETIME DEFAULT GETDATE(),
    Note NVARCHAR(255),
    FOREIGN KEY (ClassId) REFERENCES Classes(Id),
    FOREIGN KEY (TutorId) REFERENCES Tutors(Id)
);
GO

-- Drop and Create Tutor_Ratings table
IF OBJECT_ID('[dbo].[Tutor_Ratings]', 'U') IS NOT NULL DROP TABLE [dbo].[Tutor_Ratings]
CREATE TABLE [dbo].[Tutor_Ratings] (
    Id INT PRIMARY KEY IDENTITY,
    TutorId INT NOT NULL,
    RatedBy INT NOT NULL,
    Rating INT CHECK (Rating BETWEEN 1 AND 5),
    Comment NVARCHAR(MAX),
    CreatedAt DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (TutorId) REFERENCES Tutors(Id) ON DELETE CASCADE,
    FOREIGN KEY (RatedBy) REFERENCES Users(Id)
);
GO

-- Drop and Create Transactions table
IF OBJECT_ID('[dbo].[Transactions]', 'U') IS NOT NULL DROP TABLE [dbo].[Transactions]
CREATE TABLE [dbo].[Transactions] (
    Id INT PRIMARY KEY IDENTITY,
    ClassId INT NOT NULL,
    TutorId INT NOT NULL,
    Amount DECIMAL(18, 2) NOT NULL,
    PaymentDate DATETIME DEFAULT GETDATE(),
    Status NVARCHAR(20) DEFAULT 'pending',
    Note NVARCHAR(255),
    FOREIGN KEY (ClassId) REFERENCES Classes(Id),
    FOREIGN KEY (TutorId) REFERENCES Tutors(Id)
);
GO

-- Drop and Create Notifications table
IF OBJECT_ID('[dbo].[Notifications]', 'U') IS NOT NULL DROP TABLE [dbo].[Notifications]
CREATE TABLE [dbo].[Notifications] (
    Id INT PRIMARY KEY IDENTITY,
    UserId INT NOT NULL,
    Title NVARCHAR(200),
    Message NVARCHAR(MAX),
    IsRead BIT DEFAULT 0,
    CreatedAt DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (UserId) REFERENCES Users(Id) ON DELETE CASCADE
);
GO
----------------------------------------------------------------------------------------------
-- Cơ sở dữ liệu mẫu
INSERT INTO [dbo].[Users] ([FullName], [Email], [PhoneNumber], [PasswordHash], [Role]) VALUES (N'Nguyễn Văn A', N'a@gmail.com', N'0901234567', N'matkhau1', N'ADMIN');
GO
INSERT INTO [dbo].[Users] ([FullName], [Email], [PhoneNumber], [PasswordHash], [Role]) VALUES (N'Trần Thị B', N'b@gmail.com', N'0912345678', N'matkhau2', N'USER');
GO
INSERT INTO [dbo].[Users] ([FullName], [Email], [PhoneNumber], [PasswordHash], [Role]) VALUES (N'Lê Văn C', N'c@gmail.com', N'0923456789', N'matkhau3', N'USER');
GO
INSERT INTO [dbo].[Users] ([FullName], [Email], [PhoneNumber], [PasswordHash], [Role]) VALUES (N'Phạm Thị D', N'd@gmail.com', N'0934567890', N'matkhau4', N'USER');
GO
INSERT INTO [dbo].[Users] ([FullName], [Email], [PhoneNumber], [PasswordHash], [Role]) VALUES (N'Hoàng Văn E', N'e@gmail.com', N'0945678901', N'matkhau5', N'ADMIN');
GO
INSERT INTO [dbo].[Tutors] ([Id], [Gender], [BirthYear], [ExperienceYears], [AcademicLevel], [Address], [Description], [IsVerified]) VALUES (2, N'Nữ', 1985, 5, N'Tiến sĩ', N'Số 10 Đường ABC, Quận 1, TP.HCM', N'Tôi là gia sư chuyên môn cao môn Toán', 1);
GO
INSERT INTO [dbo].[Tutors] ([Id], [Gender], [BirthYear], [ExperienceYears], [AcademicLevel], [Address], [Description], [IsVerified]) VALUES (3, N'Nữ', 1991, 9, N'Cử nhân', N'Số 11 Đường ABC, Quận 2, TP.HCM', N'Tôi là gia sư chuyên môn cao môn Lý', 0);
GO
INSERT INTO [dbo].[Tutors] ([Id], [Gender], [BirthYear], [ExperienceYears], [AcademicLevel], [Address], [Description], [IsVerified]) VALUES (4, N'Nữ', 1988, 6, N'Thạc sĩ', N'Số 12 Đường ABC, Quận 3, TP.HCM', N'Tôi là gia sư chuyên môn cao môn Hóa', 1);
GO
INSERT INTO [dbo].[Tutors] ([Id], [Gender], [BirthYear], [ExperienceYears], [AcademicLevel], [Address], [Description], [IsVerified]) VALUES (5, N'Nam', 1992, 7, N'Cử nhân', N'Số 13 Đường ABC, Quận 4, TP.HCM', N'Tôi là gia sư chuyên môn cao môn Toán', 0);
GO
INSERT INTO [dbo].[Subjects] ([Name]) VALUES (N'Math');
GO
INSERT INTO [dbo].[Subjects] ([Name]) VALUES (N'English');
GO
INSERT INTO [dbo].[Subjects] ([Name]) VALUES (N'Physics');
GO
INSERT INTO [dbo].[Subjects] ([Name]) VALUES (N'Chemistry');
GO
INSERT INTO [dbo].[Subjects] ([Name]) VALUES (N'Biology');
GO
INSERT INTO [dbo].[Levels] ([Name]) VALUES (N'Beginner');
GO
INSERT INTO [dbo].[Levels] ([Name]) VALUES (N'Intermediate');
GO
INSERT INTO [dbo].[Levels] ([Name]) VALUES (N'Advanced');
GO
INSERT INTO [dbo].[Levels] ([Name]) VALUES (N'Expert');
GO
INSERT INTO [dbo].[Levels] ([Name]) VALUES (N'Master');
GO
INSERT INTO [dbo].[Locations] ([Name]) VALUES (N'Hanoi');
GO
INSERT INTO [dbo].[Locations] ([Name]) VALUES (N'HCM');
GO
INSERT INTO [dbo].[Locations] ([Name]) VALUES (N'Da Nang');
GO
INSERT INTO [dbo].[Locations] ([Name]) VALUES (N'Can Tho');
GO
INSERT INTO [dbo].[Locations] ([Name]) VALUES (N'Hai Phong');
GO
INSERT INTO [dbo].[Classes] ([PostedBy], [SubjectId], [LevelId], [LocationId], [NumberOfStudents], [Schedule], [LearningMode], [Requirements], [PreferredTutorId], [Status]) VALUES (2, 1, 1, 1, 4, N'Mon-Wed-Fri', N'Online', N'Some requirements', NULL, N'open');
GO
INSERT INTO [dbo].[Classes] ([PostedBy], [SubjectId], [LevelId], [LocationId], [NumberOfStudents], [Schedule], [LearningMode], [Requirements], [PreferredTutorId], [Status]) VALUES (3, 2, 2, 2, 2, N'Mon-Wed-Fri', N'Online', N'Some requirements', NULL, N'open');
GO
INSERT INTO [dbo].[Classes] ([PostedBy], [SubjectId], [LevelId], [LocationId], [NumberOfStudents], [Schedule], [LearningMode], [Requirements], [PreferredTutorId], [Status]) VALUES (4, 3, 3, 3, 2, N'Mon-Wed-Fri', N'Online', N'Some requirements', NULL, N'open');
GO
INSERT INTO [dbo].[Classes] ([PostedBy], [SubjectId], [LevelId], [LocationId], [NumberOfStudents], [Schedule], [LearningMode], [Requirements], [PreferredTutorId], [Status]) VALUES (5, 4, 4, 4, 2, N'Mon-Wed-Fri', N'Online', N'Some requirements', NULL, N'open');
GO
INSERT INTO [dbo].[Classes] ([PostedBy], [SubjectId], [LevelId], [LocationId], [NumberOfStudents], [Schedule], [LearningMode], [Requirements], [PreferredTutorId], [Status]) VALUES (1, 5, 5, 5, 3, N'Mon-Wed-Fri', N'Online', N'Some requirements', NULL, N'open');
GO
INSERT INTO [dbo].[Class_Approvals] ([ClassId], [AdminId], [Note]) VALUES (1, 1, N'Approved class 1');
GO
INSERT INTO [dbo].[Class_Approvals] ([ClassId], [AdminId], [Note]) VALUES (2, 1, N'Approved class 2');
GO
INSERT INTO [dbo].[Class_Approvals] ([ClassId], [AdminId], [Note]) VALUES (3, 1, N'Approved class 3');
GO
INSERT INTO [dbo].[Class_Approvals] ([ClassId], [AdminId], [Note]) VALUES (4, 1, N'Approved class 4');
GO
INSERT INTO [dbo].[Class_Approvals] ([ClassId], [AdminId], [Note]) VALUES (5, 1, N'Approved class 5');
GO
INSERT INTO [dbo].[Tutor_Class_Matches] ([ClassId], [TutorId], [Note]) VALUES (1, 3, N'Match note 1');
GO
INSERT INTO [dbo].[Tutor_Class_Matches] ([ClassId], [TutorId], [Note]) VALUES (2, 4, N'Match note 2');
GO
INSERT INTO [dbo].[Tutor_Class_Matches] ([ClassId], [TutorId], [Note]) VALUES (3, 5, N'Match note 3');
GO
INSERT INTO [dbo].[Tutor_Class_Matches] ([ClassId], [TutorId], [Note]) VALUES (4, 2, N'Match note 4');
GO
INSERT INTO [dbo].[Tutor_Class_Matches] ([ClassId], [TutorId], [Note]) VALUES (5, 3, N'Match note 5');
GO
INSERT INTO [dbo].[Tutor_Ratings] ([TutorId], [RatedBy], [Rating], [Comment]) VALUES (3, 1, 5, N'Comment 1');
GO
INSERT INTO [dbo].[Tutor_Ratings] ([TutorId], [RatedBy], [Rating], [Comment]) VALUES (4, 2, 3, N'Comment 2');
GO
INSERT INTO [dbo].[Tutor_Ratings] ([TutorId], [RatedBy], [Rating], [Comment]) VALUES (5, 3, 3, N'Comment 3');
GO
INSERT INTO [dbo].[Tutor_Ratings] ([TutorId], [RatedBy], [Rating], [Comment]) VALUES (2, 4, 5, N'Comment 4');
GO
INSERT INTO [dbo].[Tutor_Ratings] ([TutorId], [RatedBy], [Rating], [Comment]) VALUES (3, 5, 5, N'Comment 5');
GO
INSERT INTO [dbo].[Transactions] ([ClassId], [TutorId], [Amount], [Status], [Note]) VALUES (1, 2, 500.0, N'completed', N'Payment for class');
GO
INSERT INTO [dbo].[Notifications] ([UserId], [Title], [Message], [IsRead]) VALUES (1, N'Notify', N'Message 1', 0);
GO
INSERT INTO [dbo].[Notifications] ([UserId], [Title], [Message], [IsRead]) VALUES (2, N'Notify', N'Message 2', 0);
GO
INSERT INTO [dbo].[Notifications] ([UserId], [Title], [Message], [IsRead]) VALUES (3, N'Notify', N'Message 3', 0);
GO
INSERT INTO [dbo].[Notifications] ([UserId], [Title], [Message], [IsRead]) VALUES (4, N'Notify', N'Message 4', 0);
GO
INSERT INTO [dbo].[Notifications] ([UserId], [Title], [Message], [IsRead]) VALUES (5, N'Notify', N'Message 5', 0);
GO
INSERT INTO [dbo].[Tutor_Applications] ([TutorId], [CVUrl], [Status]) VALUES (2, N'http://example.com/cv.pdf', N'approved');
GO
