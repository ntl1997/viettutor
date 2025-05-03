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