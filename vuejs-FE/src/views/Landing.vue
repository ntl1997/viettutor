<template>
  <div>
    <navbar />
    <main>
      <div
        class="relative pt-16 pb-32 flex content-center items-center justify-center min-h-screen-75"
      >
        <div
          class="absolute top-0 w-full h-full bg-center bg-cover"
          style="
            background-image: url('https://giasuongmattroi.com/wp-content/uploads/2018/06/doi-ngu-gia-su-tay-nghe-cao.jpg');
          "
        >
          <span id="blackOverlay" class="w-full h-full absolute opacity-75 bg-black"></span>
        </div>
        <div class="container relative mx-auto">
          <div class="items-center flex flex-wrap">
            <div class="w-full lg:w-8/12 px-4 ml-auto mr-auto text-center">
              <div class="pr-12">
                <h2 class="text-white text-3xl font-light leading-snug mb-6">
                  Đội ngũ gia sư <span class="font-semibold text-green-400">Tài Năng Trẻ</span> gồm
                  giáo viên và sinh viên giỏi, chuyên môn hóa từng bộ môn, nhận dạy kèm tại nhà trên
                  cả nước.
                </h2>
                <h1
                  class="text-white font-extrabold mt-4 text-center flex justify-center space-x-4"
                  style="font-size: 6rem; text-transform: uppercase"
                >
                  <span class="text-yellow-500">HÃY</span>
                  <span class="text-green-500" style="color: green">TÌM</span>
                  <span class="text-green-500" style="color: green">GIA</span>
                  <span class="text-green-500" style="color: green">SƯ</span>
                  <span class="text-green-500" style="color: green">GIỎI</span>
                  <span class="text-green-500">NGAY!</span>
                </h1>

                <div class="mt-6 flex justify-center items-center">
                  <input
                    type="text"
                    placeholder="Hãy nhập một môn học!"
                    class="w-full max-w-md px-4 py-3 rounded-l-full text-gray-800 placeholder-gray-400 focus:outline-none shadow-md text-lg"
                    style="
                      border-top-left-radius: 9999px;
                      border-bottom-left-radius: 9999px;
                      font-size: 1.5rem;
                    "
                  />
                  <button
                    class="bg-green-500 hover:bg-green-600 text-white font-bold px-6 py-3 rounded-r-full shadow-md text-lg"
                    style="
                      border-top-right-radius: 9999px;
                      border-bottom-right-radius: 9999px;
                      font-size: 1.5rem;
                    "
                  >
                    Tìm Gia Sư Ngay!
                  </button>
                </div>

                <button
                  class="mt-6 bg-yellow-400 hover:bg-yellow-500 text-white font-bold py-3 px-6 rounded-full shadow-lg text-lg"
                  style="font-size: 1.5rem"
                >
                  Tham gia vào đội ngũ Gia Sư !!!
                </button>
              </div>
            </div>
          </div>
        </div>

        <div
          class="top-auto bottom-0 left-0 right-0 w-full absolute pointer-events-none overflow-hidden h-70-px"
          style="transform: translateZ(0)"
        >
          <svg
            class="absolute bottom-0 overflow-hidden"
            xmlns="http://www.w3.org/2000/svg"
            preserveAspectRatio="none"
            version="1.1"
            viewBox="0 0 2560 100"
            x="0"
            y="0"
          >
            <polygon
              class="text-blueGray-200 fill-current"
              points="2560 0 2560 100 0 100"
            ></polygon>
          </svg>
        </div>
      </div>

      <section class="pb-20 bg-blueGray-200 -mt-24">
        <div class="container mx-auto px-4">
          <div class="flex flex-wrap">
            <div class="lg:pt-12 pt-6 w-full md:w-4/12 px-4 text-center">
              <div
                class="relative flex flex-col min-w-0 break-words bg-white w-full mb-8 shadow-lg rounded-lg"
              >
                <div class="px-4 py-5 flex-auto">
                  <div
                    class="text-white p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-red-400"
                  >
                    <i class="fas fa-award"></i>
                  </div>
                  <h6 class="text-3xl lg:text-4xl font-bold">
                    Đội ngũ <span style="color: green">chất lượng cao</span>
                  </h6>
                  <p class="mt-4 mb-6 text-xl lg:text-2xl leading-relaxed text-blueGray-500">
                    Gia sư tuyển chọn kỹ, giàu kinh nghiệm, cam kết lộ trình học cá nhân hoá.
                  </p>
                </div>
              </div>
            </div>

            <div class="w-full md:w-4/12 px-4 text-center">
              <div
                class="relative flex flex-col min-w-0 break-words bg-white w-full mb-8 shadow-lg rounded-lg"
              >
                <div class="px-4 py-5 flex-auto">
                  <div
                    class="text-white p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-lightBlue-400"
                  >
                    <svg
                      xmlns="http://www.w3.org/2000/svg"
                      width="24"
                      height="24"
                      viewBox="0 0 24 24"
                      fill="none"
                      stroke="currentColor"
                      stroke-width="2"
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      class="lucide lucide-search-icon lucide-search"
                    >
                      <path d="m21 21-4.34-4.34" />
                      <circle cx="11" cy="11" r="8" />
                    </svg>
                  </div>
                  <h6 class="text-3xl lg:text-4xl font-bold">
                    Tìm gia sư <span style="color: green">toàn quốc</span>
                  </h6>
                  <p class="mt-4 mb-6 text-xl lg:text-2xl leading-relaxed text-blueGray-500">
                    Kết nối gia sư uy tín khắp các tỉnh thành 
                    trên toàn quốc, đáp ứng mọi nhu cầu học tập.
                  </p>
                </div>
              </div>
            </div>

            <div class="pt-6 w-full md:w-4/12 px-4 text-center">
              <div
                class="relative flex flex-col min-w-0 break-words bg-white w-full mb-8 shadow-lg rounded-lg"
              >
                <div class="px-4 py-5 flex-auto">
                  <div
                    class="text-white p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-emerald-400"
                  >
                    <svg
                      xmlns="http://www.w3.org/2000/svg"
                      width="24"
                      height="24"
                      viewBox="0 0 24 24"
                      fill="none"
                      stroke="currentColor"
                      stroke-width="2"
                      stroke-linecap="round"
                      stroke-linejoin="round"
                      class="lucide lucide-phone-icon lucide-phone"
                    >
                      <path
                        d="M13.832 16.568a1 1 0 0 0 1.213-.303l.355-.465A2 2 0 0 1 17 15h3a2 2 0 0 1 2 2v3a2 2 0 0 1-2 2A18 18 0 0 1 2 4a2 2 0 0 1 2-2h3a2 2 0 0 1 2 2v3a2 2 0 0 1-.8 1.6l-.468.351a1 1 0 0 0-.292 1.233 14 14 0 0 0 6.392 6.384"
                      />
                    </svg>
                  </div>
                  <h6 class="text-3xl lg:text-4xl font-bold">
                    Hỗ trợ nhiệt tình <span style="color: green">24/7</span>
                  </h6>
                  <p class="mt-4 mb-6 text-xl lg:text-2xl leading-relaxed text-blueGray-500">
                    Hỗ trợ trực tuyến 24/7 không gián đoạn, phản hồi luôn tức thì mọi thắc mắc
                    của bạn.
                  </p>
                </div>
              </div>
            </div>
          </div>

          <div class="flex flex-wrap items-center mt-32">
            <!-- Feature Grid -->
            <div class="w-full md:w-5/12 px-4 mx-auto">
              <div class="grid gap-6 sm:grid-cols-1 md:grid-cols-2 xl:grid-cols-2 text-gray-800">
                <!-- Item -->
                <div
                  class="flex items-start p-5 space-x-4 bg-white rounded-2xl shadow hover:shadow-lg transition-shadow duration-300"
                >
                  <i class="fas fa-thumbs-up text-4xl text-emerald-500 shrink-0"></i>
                  <div>
                    <h4 class="mb-1 text-xl font-semibold">Chất lượng</h4>
                    <p class="text-base leading-relaxed">
                      Đội ngũ giáo viên chọn lọc kỹ, chuyên môn cao, tâm&nbsp;huyết với nghề.
                    </p>
                  </div>
                </div>

                <!-- Item -->
                <div
                  class="flex items-start p-5 space-x-4 bg-white rounded-2xl shadow hover:shadow-lg transition-shadow duration-300"
                >
                  <i class="fas fa-gem text-4xl text-emerald-500 shrink-0"></i>
                  <div>
                    <h4 class="mb-1 text-xl font-semibold">Uy tín</h4>
                    <p class="text-base leading-relaxed">
                      Hơn 10 năm kinh nghiệm, am hiểu phụ&nbsp;huynh &amp; học&nbsp;viên.
                    </p>
                  </div>
                </div>

                <!-- Item -->
                <div
                  class="flex items-start p-5 space-x-4 bg-white rounded-2xl shadow hover:shadow-lg transition-shadow duration-300"
                >
                  <i class="fas fa-clipboard-list text-4xl text-emerald-500 shrink-0"></i>
                  <div>
                    <h4 class="mb-1 text-xl font-semibold">Chương trình học</h4>
                    <p class="text-base leading-relaxed">
                      Luôn cập nhật, phù hợp cải cách mới của Bộ&nbsp;GD &amp;&nbsp;ĐT.
                    </p>
                  </div>
                </div>

                <!-- Item -->
                <div
                  class="flex items-start p-5 space-x-4 bg-white rounded-2xl shadow hover:shadow-lg transition-shadow duration-300"
                >
                  <i class="fas fa-comments text-4xl text-emerald-500 shrink-0"></i>
                  <div>
                    <h4 class="mb-1 text-xl font-semibold">Cách dạy và học</h4>
                    <p class="text-base leading-relaxed">
                      Phương pháp mềm dẻo, giúp học viên tiếp thu &amp; tiến bộ nhanh.
                    </p>
                  </div>
                </div>

                <!-- Item -->
                <div
                  class="flex items-start p-5 space-x-4 bg-white rounded-2xl shadow hover:shadow-lg transition-shadow duration-300"
                >
                  <i class="fas fa-heart text-4xl text-emerald-500 shrink-0"></i>
                  <div>
                    <h4 class="mb-1 text-xl font-semibold">Sự hài lòng</h4>
                    <p class="text-base leading-relaxed">
                      Hài lòng của phụ huynh &amp; thành công của học&nbsp;viên là ưu tiên số 1.
                    </p>
                  </div>
                </div>

                <!-- Item -->
                <div
                  class="flex items-start p-5 space-x-4 bg-white rounded-2xl shadow hover:shadow-lg transition-shadow duration-300"
                >
                  <i class="fas fa-stopwatch text-4xl text-emerald-500 shrink-0"></i>
                  <div>
                    <h4 class="mb-1 text-xl font-semibold">Kết nối nhanh chóng</h4>
                    <p class="text-base leading-relaxed">
                      Chỉ 2 phút điền form – chúng tôi liên hệ ngay với gia sư phù hợp.
                    </p>
                  </div>
                </div>
              </div>
            </div>

            <div class="w-full md:w-4/12 px-4 mr-auto ml-auto">
              <div
                class="relative flex flex-col min-w-0 break-words bg-white w-full mb-6 shadow-lg rounded-lg bg-emerald-500"
              >
                <img
                  alt="..."
                  src="https://giasunhatanh.vn/wp-content/uploads/2020/10/gia-su-thcs.jpg"
                  class="w-full align-middle rounded-t-lg"
                />
                <blockquote class="relative p-8 mb-4">
                  <svg
                    preserveAspectRatio="none"
                    xmlns="http://www.w3.org/2000/svg"
                    viewBox="0 0 583 95"
                    class="absolute left-0 w-full block h-95-px -top-94-px"
                  >
                    <polygon
                      points="-30,95 583,95 583,65"
                      class="text-emerald-500 fill-current"
                    ></polygon>
                  </svg>
                  <h4 class="text-4xl font-bold text-white text-center">
                    Tại sao bạn <span style="color: yellow">Chọn chúng tôi</span>?
                  </h4>
                </blockquote>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section class="relative py-20">
        <div
          class="bottom-auto top-0 left-0 right-0 w-full absolute pointer-events-none overflow-hidden -mt-20 h-20"
          style="transform: translateZ(0)"
        >
          <svg
            class="absolute bottom-0 overflow-hidden"
            xmlns="http://www.w3.org/2000/svg"
            preserveAspectRatio="none"
            version="1.1"
            viewBox="0 0 2560 100"
            x="0"
            y="0"
          >
            <polygon class="text-white fill-current" points="2560 0 2560 100 0 100"></polygon>
          </svg>
        </div>

        <div class="container mx-auto px-4">
          <div class="container mx-auto py-8">
            <div
              class="max-w-7xl mx-auto px-4 flex flex-col md:flex-row md:items-start md:gap-32 md:w-full"
            >
              <!-- Gia sư Mới -->
              <div class="basis-[29.17%] md:px-10">
                <h2 class="text-xl font-bold mb-4 border-b-2 border-green-500 inline-block">
                  Gia sư <span style="color: green">Mới</span>
                </h2>
                <ul class="divide-y divide-dashed divide-gray-300">
                  <li
                    class="flex items-center space-x-4 py-2 min-h-[48px]"
                    v-for="tutor in newTutors.slice(0, 10)"
                    :key="tutor.id"
                  >
                    <img :src="tutor.avatar" class="w-8 h-8 rounded-full" alt="avatar" />
                    <span class="text-gray-800">{{ tutor.name }}</span>
                  </li>
                </ul>
              </div>

              <!-- Gia sư nổi bật -->
              <div class="basis-[29.17%] md:px-10">
                <h2 class="text-xl font-bold mb-4 border-b-2 border-green-500 inline-block">
                  Gia sư nổi bật<span style="color: green"> Tháng 05</span>
                </h2>
                <ul class="divide-y divide-dashed divide-gray-300">
                  <li
                    class="flex items-center justify-between py-2 min-h-[48px]"
                    v-for="tutor in highlightedTutors.slice(0, 10)"
                    :key="tutor.id"
                  >
                    <div class="flex items-center space-x-4">
                      <img :src="tutor.avatar" class="w-8 h-8 rounded-full" alt="avatar" />
                      <span class="text-gray-800">{{ tutor.name }}</span>
                    </div>
                    <span
                      class="rounded-full bg-gray-400 text-white text-xs w-5 h-5 flex items-center justify-center"
                    >
                      {{ tutor.badge }}
                    </span>
                  </li>
                </ul>
              </div>

              <!-- Lớp mới -->
              <div class="md:w-5/12 md:pl-10">
                <h2 class="text-xl font-bold mb-4 border-b-2 border-green-500 inline-block">
                  Lớp <span style="color: green">Mới</span>
                </h2>
                <ul class="divide-y divide-dashed divide-gray-300">
                  <li
                    class="flex items-center space-x-4 py-3 h-[48px] px-2"
                    v-for="classItem in newClasses.slice(0, 10)"
                    :key="classItem.id"
                  >
                    <span class="text-sm font-semibold text-gray-800 w-20 shrink-0">
                      {{ classItem.id }}
                    </span>
                    <span class="text-sm text-gray-600 truncate">
                      {{ classItem.description }}
                    </span>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section class="pb-24">
        <div class="container mx-auto px-4">
          <!-- Tiêu đề -->
          <div class="mb-4 text-left">
            <h2 class="text-3xl font-bold">
              Tìm gia sư theo các
              <span class="relative inline-block" style="color: green">
                môn phổ biến
                <span class="absolute left-0 -bottom-1 w-full h-[2px] bg-green-500"></span>
              </span>
            </h2>
          </div>
          <!-- Danh sách button môn học -->
          <div class="flex flex-wrap -mx-2">
            <div v-for="subject in popularSubjects" :key="subject" class="px-2 mb-2">
              <button class="subject-button">
                {{ subject }}
              </button>
            </div>
          </div>
        </div>

        <!-- Đăng ký ngay và Quy trình nhận lớp -->
        <div
          class="bg-cover bg-center py-12 text-gray-900"
          style="background-image: url('/images/bg-register.jpg')"
        >
          <div class="container mx-auto px-4 grid grid-cols-1 lg:grid-cols-2 gap-8 items-center">
            <!-- Bên trái: Đăng ký ngay -->
            <div>
              <h3 class="text-3xl font-bold mb-4">
                <span class="relative inline-block" style="color: green"
                  >Đăng ký
                  <span class="absolute left-0 -bottom-1 w-full h-[2px] bg-green-500"></span>
                </span>
                ngay!
              </h3>
              <ul class="text-lg mb-6 space-y-2">
                <li>
                  - <span style="color: green"><strong>Nếu bạn cần tìm Gia sư:</strong></span> hãy
                  <span class="text-green-700 font-bold">Đăng Ký ngay</span> để tiếp cận với hàng
                  nghìn gia sư trên toàn quốc.
                </li>
                <li>
                  - <span style="color: green"><strong>Nếu bạn là gia sư:</strong></span> hãy
                  <span class="text-green-700 font-bold">Đăng Ký ngay</span> để tiếp cận nhanh chóng
                  với học viên.
                </li>
              </ul>

              <!-- Thống kê -->
              <div class="grid grid-cols-2 md:grid-cols-4 gap-4 text-center mt-6">
                <div>
                  <div class="text-green-600 text-4xl mb-1">📘</div>
                  <div class="text-2xl font-bold">754</div>
                  <div class="uppercase text-sm">Lớp mới mỗi ngày</div>
                </div>
                <div>
                  <div class="text-green-600 text-4xl mb-1">😊</div>
                  <div class="text-2xl font-bold">3,000</div>
                  <div class="uppercase text-sm">Gia sư</div>
                </div>
                <div>
                  <div class="text-green-600 text-4xl mb-1">👥</div>
                  <div class="text-2xl font-bold">675</div>
                  <div class="uppercase text-sm">Nhận lớp thành công</div>
                </div>
                <div>
                  <div class="text-green-600 text-4xl mb-1">🎓</div>
                  <div class="text-2xl font-bold">1,248</div>
                  <div class="uppercase text-sm">Phụ huynh hài lòng</div>
                </div>
              </div>
            </div>

            <!-- Bên phải: Quy trình nhận lớp -->
            <div class="mt-6 lg:mt-0">
              <h3 class="text-3xl font-bold mb-4">
                Quy trình nhận lớp <span style="color: green">của gia sư</span>
              </h3>
              <div class="text-lg space-y-2 leading-relaxed">
                <p>
                  Hướng dẫn nhận lớp tại web:<br />
                  <strong>Viettutor.vn</strong>
                </p>
                <p>
                  <strong>Bước 1:</strong> Đăng ký tài khoản gia sư và cập nhật thông tin gia sư đầy
                  đủ tại: <strong>Viettutor.vn</strong>
                </p>
                <p>
                  <strong>Bước 2:</strong> Kích “<strong>Nhận lớp ngay</strong>” tại lớp bạn muốn
                  nhận, bộ phận giao lớp kiểm tra thông tin của bạn phù hợp sẽ alo sắp xếp, nếu chưa
                  phù hợp sẽ phản hồi trong tài khoản của bạn mục “<strong>Danh sách lớp dạy</strong
                  >”.
                </p>
                <p>
                  <strong>Bước 3:</strong> Khi bộ phận giao lớp xác nhận bạn được nhận lớp, bạn
                  chuyển khoản hoặc đến trung tâm nhận lớp.
                </p>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section class="relative block bg-blueGray-800 py-24 px-4">
        <div class="max-w-5xl mx-auto text-center">
          <!-- Tiêu đề -->
          <h2 class="text-4xl font-extrabold text-white">NHẬN XÉT CỦA</h2>
          <div class="w-24 h-1 bg-green-500 mx-auto my-4 rounded"></div>
          <h3 class="text-2xl md:text-3xl font-bold text-white">
            <span class="text-green-400">PHỤ HUYNH</span> &
            <span class="text-green-500">GIÁO VIÊN</span>
          </h3>

          <!-- Avatar -->
          <div class="mt-8">
            <img
              :src="reviews[currentIndex].avatar"
              alt="Avatar"
              class="w-24 h-24 rounded-full mx-auto border-4 border-white shadow-lg object-cover"
            />
          </div>

          <!-- Icon trích dẫn -->
          <div class="text-5xl text-green-500 mt-6 mb-4">“</div>

          <!-- Nội dung nhận xét -->
          <p class="text-white text-lg leading-relaxed max-w-3xl mx-auto">
            {{ reviews[currentIndex].text }}
          </p>

          <!-- Tên -->
          <p class="mt-6 font-semibold text-white">{{ reviews[currentIndex].name }}</p>

          <!-- Chấm điều hướng -->
          <div class="mt-8 flex justify-center space-x-2">
            <span
              v-for="(review, index) in reviews"
              :key="index"
              class="w-4 h-4 rounded-full transition duration-300 cursor-pointer"
              :class="index === currentIndex ? 'bg-white' : 'bg-white/40'"
              @click="goToReview(index)"
            ></span>
          </div>
        </div>
      </section>

      <section class="relative block py-24 bg-blueGray-800">
        <div class="container mx-auto px-4">
          <div class="flex flex-wrap justify-center mt-12">
            <div class="w-full lg:w-6/12 px-4">
              <div
                class="relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-200"
              >
                <div class="flex-auto p-5 lg:p-10">
                  <h4 class="text-2xl font-semibold">Bạn muốn làm việc với chúng tôi?</h4>
                  <p class="leading-relaxed mt-1 mb-4 text-blueGray-500">
                    Hãy hoàn thành mẫu này và chúng tôi sẽ phản hồi bạn trong vòng 24 giờ.
                  </p>

                  <!-- Full Name -->
                  <div class="relative w-full mb-3 mt-8">
                    <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2">
                      Tên đầy đủ
                    </label>
                    <input
                      type="text"
                      class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                      placeholder="Tên đầy đủ"
                    />
                  </div>

                  <!-- Email -->
                  <div class="relative w-full mb-3">
                    <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2">
                      Email
                    </label>
                    <input
                      type="email"
                      class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                      placeholder="Email"
                    />
                  </div>

                  <!-- Message -->
                  <div class="relative w-full mb-3">
                    <label class="block uppercase text-blueGray-600 text-xs font-bold mb-2">
                      Tin nhắn
                    </label>
                    <textarea
                      rows="4"
                      class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full"
                      placeholder="Nhập tin nhắn..."
                    ></textarea>
                  </div>

                  <!-- Button -->
                  <div class="text-center mt-6">
                    <button
                      class="bg-blueGray-800 text-white active:bg-blueGray-600 text-sm font-bold uppercase px-6 py-3 rounded shadow hover:shadow-lg outline-none focus:outline-none ease-linear transition-all duration-150"
                      type="button"
                    >
                      Gửi tin nhắn
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </main>
    <footer-component />
  </div>
</template>
<script setup>
import { ref, onMounted, onUnmounted } from 'vue'
import Navbar from '@/components/Navbars/AuthNavbar.vue'
import FooterComponent from '@/components/Footers/Footer.vue'
const newTutors = [
  { id: 1, name: 'Trần Lê Hoài Thương', avatar: 'https://randomuser.me/api/portraits/women/1.jpg' },
  { id: 2, name: 'Dương Minh Hoàng', avatar: 'https://randomuser.me/api/portraits/men/2.jpg' },
  { id: 3, name: 'Nguyễn Văn Thực', avatar: 'https://randomuser.me/api/portraits/men/3.jpg' },
  { id: 4, name: 'Lê Chí Khang', avatar: 'https://randomuser.me/api/portraits/men/4.jpg' },
  { id: 5, name: 'Hoàng Gia Phú Cường', avatar: 'https://randomuser.me/api/portraits/men/5.jpg' },
  { id: 6, name: 'Nguyễn Tấn Vinh', avatar: 'https://randomuser.me/api/portraits/men/6.jpg' },
  { id: 7, name: 'Lê Bá Dũng', avatar: 'https://randomuser.me/api/portraits/men/7.jpg' },
  { id: 8, name: 'Đỗ Vũ Ngân Giao', avatar: 'https://randomuser.me/api/portraits/women/8.jpg' },
  { id: 9, name: 'tuyetnhung', avatar: 'https://randomuser.me/api/portraits/women/9.jpg' },
  { id: 10, name: 'Mai Tùng Lâm', avatar: 'https://randomuser.me/api/portraits/men/10.jpg' },
]

const highlightedTutors = [
  {
    id: 1,
    name: 'Ngô Quang Long',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/men/11.jpg',
  },
  {
    id: 2,
    name: 'Nguyễn Bích Loan',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/women/12.jpg',
  },
  {
    id: 3,
    name: 'Phạm Thị Thơm',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/women/13.jpg',
  },
  {
    id: 4,
    name: 'Mai Đức Hưng',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/men/14.jpg',
  },
  {
    id: 5,
    name: 'Nguyễn Xuân Huy',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/men/15.jpg',
  },
  {
    id: 6,
    name: 'Huỳnh Duyên',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/women/16.jpg',
  },
  {
    id: 7,
    name: 'Nguyễn Thị Lãnh',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/women/17.jpg',
  },
  {
    id: 8,
    name: 'Nguyễn Diệu Hồng',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/women/18.jpg',
  },
  {
    id: 9,
    name: 'Đoàn Anh Thư',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/women/19.jpg',
  },
  {
    id: 10,
    name: 'Phạm Thị Minh',
    badge: '1',
    avatar: 'https://randomuser.me/api/portraits/women/20.jpg',
  },
]

const newClasses = [
  { id: '24334', description: 'Cần gia sư học thiết kế đồ họa tại Tân Uyên, Bình Dương' },
  { id: '24329', description: 'Cần gia sư môn Tiếng Anh lớp 12 tại Nhà Bè, Hồ Chí Minh' },
  { id: '17737', description: 'Cần gia sư môn Tiếng Trung tại quận 5, Hồ Chí Minh' },
  { id: '23711', description: 'Cần gia sư môn Piano tại Đức Hòa, Long An' },
  { id: '24325', description: 'Cần gia sư môn Corel tại quận 7, Hồ Chí Minh' },
  { id: '24324', description: 'Cần gia sư môn Guitar tại Diên Khánh, Khánh Hòa' },
  { id: '24322', description: 'Tìm Gia sư kèm toán ôn thi THPTQG tại Quy Nhơn, Tỉnh Bình Định' },
  { id: '24320', description: 'Cần gia sư môn Tiếng Việt cho người Hàn tại Gia Lâm, Hà Nội' },
  { id: '24316', description: 'Cần gia sư môn Toán lớp 9 tại Liên Chiểu, Đà Nẵng' },
  { id: '21236', description: 'Cần gia sư môn Violin tại Hóc Môn, Hồ Chí Minh' },
]

const popularSubjects = [
  'Toán Lớp 2',
  'Toán lớp 3',
  'Toán Lớp 1',
  'Toán lớp 4',
  'Toán lớp 5',
  'Toán lớp 6',
  'Toán lớp 7',
  'Tiếng Việt Lớp 1',
  'Tiếng Việt Lớp 2',
  'Toán lớp 8',
  'Tiếng Việt lớp 3',
  'Tiếng Anh',
  'Tiếng Việt lớp 4',
  'Tiếng Anh lớp 3',
  'Toán lớp 9',
  'Tiếng Anh Lớp 2',
  'Tiếng Anh Lớp 1',
  'Tiếng Anh lớp 4',
  'Tiếng Việt lớp 5',
]

const reviews = ref([
  {
    avatar: 'https://i.pravatar.cc/150?img=36',
    name: 'Chị Hương, Giáo viên',
    text: 'Tôi đánh giá cao sự chuyên nghiệp của trung tâm.',
  },
  {
    avatar: 'https://i.pravatar.cc/150?img=32',
    name: 'Anh Dũng, Phụ huynh',
    text: 'Gia sư hỗ trợ tận tình, con tôi đã tự giác học hơn hẳn.',
  },
  {
    avatar: 'https://i.pravatar.cc/150?img=47',
    name: 'Thảo My, SV ĐH Sài Gòn',
    text: 'Mình nhận lớp từ trung tâm rất nhiều, hiện tại full lớp. Rất uy tín nhé mọi người!',
  },
])

const currentIndex = ref(0)

const goToReview = (index) => {
  currentIndex.value = index
}

let intervalId = null

onMounted(() => {
  intervalId = setInterval(() => {
    currentIndex.value = (currentIndex.value + 1) % reviews.value.length
  }, 5000)
})

onUnmounted(() => {
  clearInterval(intervalId)
})
</script>

<style>
.subject-button {
  padding: 12px 24px;
  border: 1px solid #ccc;
  border-radius: 6px;
  background-color: white;
  color: #333;
  font-size: 14px;
  font-weight: 500;
  cursor: pointer;
  transition: all 0.3s ease;
}

.subject-button:hover {
  background-color: #22c55e;
  color: white;
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
  transform: scale(1.05);
}
</style>
