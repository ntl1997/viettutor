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
          <div class="items-center flex flex-wrap">
            <div class="w-full md:w-4/12 ml-auto mr-auto px-4">
              <img
                alt="..."
                class="max-w-full rounded-lg shadow-lg"
                src="https://images.unsplash.com/photo-1555212697-194d092e3b8f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"
              />
            </div>
            <div class="w-full md:w-5/12 ml-auto mr-auto px-4">
              <div class="md:pr-12">
                <div
                  class="text-emerald-600 p-3 text-center inline-flex items-center justify-center w-16 h-16 mb-6 shadow-lg rounded-full bg-emerald-300"
                >
                  <i class="fas fa-rocket text-xl"></i>
                </div>
                <h3 class="text-3xl font-semibold">A growing company</h3>
                <p class="mt-4 text-lg leading-relaxed text-blueGray-500">
                  The extension comes with three pre-built pages to help you get started faster. You
                  can change the text and images and you're good to go.
                </p>
                <ul class="list-none mt-6">
                  <li class="py-2">
                    <div class="flex items-center">
                      <div>
                        <span
                          class="text-xs font-semibold inline-block py-1 px-2 uppercase rounded-full text-emerald-600 bg-emerald-200 mr-3"
                        >
                          <i class="fas fa-fingerprint"></i>
                        </span>
                      </div>
                      <div>
                        <h4 class="text-blueGray-500">Carefully crafted components</h4>
                      </div>
                    </div>
                  </li>
                  <li class="py-2">
                    <div class="flex items-center">
                      <div>
                        <span
                          class="text-xs font-semibold inline-block py-1 px-2 uppercase rounded-full text-emerald-600 bg-emerald-200 mr-3"
                        >
                          <i class="fab fa-html5"></i>
                        </span>
                      </div>
                      <div>
                        <h4 class="text-blueGray-500">Amazing page examples</h4>
                      </div>
                    </div>
                  </li>
                  <li class="py-2">
                    <div class="flex items-center">
                      <div>
                        <span
                          class="text-xs font-semibold inline-block py-1 px-2 uppercase rounded-full text-emerald-600 bg-emerald-200 mr-3"
                        >
                          <i class="far fa-paper-plane"></i>
                        </span>
                      </div>
                      <div>
                        <h4 class="text-blueGray-500">Dynamic components</h4>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section class="pt-20 pb-48">
        <div class="container mx-auto px-4">
          <div class="flex flex-wrap justify-center text-center mb-24">
            <div class="w-full lg:w-6/12 px-4">
              <h2 class="text-4xl font-semibold">Here are our heroes</h2>
              <p class="text-lg leading-relaxed m-4 text-blueGray-500">
                According to the National Oceanic and Atmospheric Administration, Ted, Scambos,
                NSIDClead scentist, puts the potentially record maximum.
              </p>
            </div>
          </div>
          <div class="flex flex-wrap">
            <div class="w-full md:w-6/12 lg:w-3/12 lg:mb-0 mb-12 px-4">
              <div class="px-6">
                <img alt="..." :src="team1" class="shadow-lg rounded-full mx-auto max-w-120-px" />
                <div class="pt-6 text-center">
                  <h5 class="text-xl font-bold">Ryan Tompson</h5>
                  <p class="mt-1 text-sm text-blueGray-400 uppercase font-semibold">
                    Web Developer
                  </p>
                  <div class="mt-6">
                    <button
                      class="bg-lightBlue-400 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-twitter"></i>
                    </button>
                    <button
                      class="bg-lightBlue-600 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-facebook-f"></i>
                    </button>
                    <button
                      class="bg-pink-500 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-dribbble"></i>
                    </button>
                  </div>
                </div>
              </div>
            </div>
            <div class="w-full md:w-6/12 lg:w-3/12 lg:mb-0 mb-12 px-4">
              <div class="px-6">
                <img alt="..." :src="team2" class="shadow-lg rounded-full mx-auto max-w-120-px" />
                <div class="pt-6 text-center">
                  <h5 class="text-xl font-bold">Romina Hadid</h5>
                  <p class="mt-1 text-sm text-blueGray-400 uppercase font-semibold">
                    Marketing Specialist
                  </p>
                  <div class="mt-6">
                    <button
                      class="bg-red-600 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-google"></i>
                    </button>
                    <button
                      class="bg-lightBlue-600 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-facebook-f"></i>
                    </button>
                  </div>
                </div>
              </div>
            </div>
            <div class="w-full md:w-6/12 lg:w-3/12 lg:mb-0 mb-12 px-4">
              <div class="px-6">
                <img alt="..." :src="team3" class="shadow-lg rounded-full mx-auto max-w-120-px" />
                <div class="pt-6 text-center">
                  <h5 class="text-xl font-bold">Alexa Smith</h5>
                  <p class="mt-1 text-sm text-blueGray-400 uppercase font-semibold">
                    UI/UX Designer
                  </p>
                  <div class="mt-6">
                    <button
                      class="bg-red-600 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-google"></i>
                    </button>
                    <button
                      class="bg-lightBlue-400 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-twitter"></i>
                    </button>
                    <button
                      class="bg-blueGray-700 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-instagram"></i>
                    </button>
                  </div>
                </div>
              </div>
            </div>
            <div class="w-full md:w-6/12 lg:w-3/12 lg:mb-0 mb-12 px-4">
              <div class="px-6">
                <img alt="..." :src="team4" class="shadow-lg rounded-full mx-auto max-w-120-px" />
                <div class="pt-6 text-center">
                  <h5 class="text-xl font-bold">Jenna Kardi</h5>
                  <p class="mt-1 text-sm text-blueGray-400 uppercase font-semibold">
                    Founder and CEO
                  </p>
                  <div class="mt-6">
                    <button
                      class="bg-pink-500 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-dribbble"></i>
                    </button>
                    <button
                      class="bg-red-600 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-google"></i>
                    </button>
                    <button
                      class="bg-lightBlue-400 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-twitter"></i>
                    </button>
                    <button
                      class="bg-blueGray-700 text-white w-8 h-8 rounded-full outline-none focus:outline-none mr-1 mb-1"
                      type="button"
                    >
                      <i class="fab fa-instagram"></i>
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section class="pb-20 relative block bg-blueGray-800">
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
            <polygon
              class="text-blueGray-800 fill-current"
              points="2560 0 2560 100 0 100"
            ></polygon>
          </svg>
        </div>

        <div class="container mx-auto px-4 lg:pt-24 lg:pb-64">
          <div class="flex flex-wrap text-center justify-center">
            <div class="w-full lg:w-6/12 px-4">
              <h2 class="text-4xl font-semibold text-white">Build something</h2>
              <p class="text-lg leading-relaxed mt-4 mb-4 text-blueGray-400">
                Put the potentially record low maximum sea ice extent tihs year down to low ice.
                According to the National Oceanic and Atmospheric Administration, Ted, Scambos.
              </p>
            </div>
          </div>
          <div class="flex flex-wrap mt-12 justify-center">
            <div class="w-full lg:w-3/12 px-4 text-center">
              <div
                class="text-blueGray-800 p-3 w-12 h-12 shadow-lg rounded-full bg-white inline-flex items-center justify-center"
              >
                <i class="fas fa-medal text-xl"></i>
              </div>
              <h6 class="text-xl mt-5 font-semibold text-white">Excelent Services</h6>
              <p class="mt-2 mb-4 text-blueGray-400">
                Some quick example text to build on the card title and make up the bulk of the
                card's content.
              </p>
            </div>
            <div class="w-full lg:w-3/12 px-4 text-center">
              <div
                class="text-blueGray-800 p-3 w-12 h-12 shadow-lg rounded-full bg-white inline-flex items-center justify-center"
              >
                <i class="fas fa-poll text-xl"></i>
              </div>
              <h5 class="text-xl mt-5 font-semibold text-white">Grow your market</h5>
              <p class="mt-2 mb-4 text-blueGray-400">
                Some quick example text to build on the card title and make up the bulk of the
                card's content.
              </p>
            </div>
            <div class="w-full lg:w-3/12 px-4 text-center">
              <div
                class="text-blueGray-800 p-3 w-12 h-12 shadow-lg rounded-full bg-white inline-flex items-center justify-center"
              >
                <i class="fas fa-lightbulb text-xl"></i>
              </div>
              <h5 class="text-xl mt-5 font-semibold text-white">Launch time</h5>
              <p class="mt-2 mb-4 text-blueGray-400">
                Some quick example text to build on the card title and make up the bulk of the
                card's content.
              </p>
            </div>
          </div>
        </div>
      </section>
      <section class="relative block py-24 lg:pt-0 bg-blueGray-800">
        <div class="container mx-auto px-4">
          <div class="flex flex-wrap justify-center lg:-mt-64 -mt-48">
            <div class="w-full lg:w-6/12 px-4">
              <div
                class="relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-200"
              >
                <div class="flex-auto p-5 lg:p-10">
                  <h4 class="text-2xl font-semibold">Want to work with us?</h4>
                  <p class="leading-relaxed mt-1 mb-4 text-blueGray-500">
                    Complete this form and we will get back to you in 24 hours.
                  </p>
                  <div class="relative w-full mb-3 mt-8">
                    <label
                      class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                      htmlFor="full-name"
                    >
                      Full Name
                    </label>
                    <input
                      type="text"
                      class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                      placeholder="Full Name"
                    />
                  </div>

                  <div class="relative w-full mb-3">
                    <label
                      class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                      htmlFor="email"
                    >
                      Email
                    </label>
                    <input
                      type="email"
                      class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                      placeholder="Email"
                    />
                  </div>

                  <div class="relative w-full mb-3">
                    <label
                      class="block uppercase text-blueGray-600 text-xs font-bold mb-2"
                      htmlFor="message"
                    >
                      Message
                    </label>
                    <textarea
                      rows="4"
                      cols="80"
                      class="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full"
                      placeholder="Type a message..."
                    />
                  </div>
                  <div class="text-center mt-6">
                    <button
                      class="bg-blueGray-800 text-white active:bg-blueGray-600 text-sm font-bold uppercase px-6 py-3 rounded shadow hover:shadow-lg outline-none focus:outline-none mr-1 mb-1 ease-linear transition-all duration-150"
                      type="button"
                    >
                      Send Message
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
<script>
import Navbar from '@/components/Navbars/AuthNavbar.vue'
import FooterComponent from '@/components/Footers/Footer.vue'

import team1 from '@/assets/img/team-1-800x800.jpg'
import team2 from '@/assets/img/team-2-800x800.jpg'
import team3 from '@/assets/img/team-3-800x800.jpg'
import team4 from '@/assets/img/team-4-470x470.png'

export default {
  data() {
    return {
      team1,
      team2,
      team3,
      team4,
    }
  },
  components: {
    Navbar,
    FooterComponent,
  },
}
</script>
