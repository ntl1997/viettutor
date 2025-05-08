<template>
  <div class="flex flex-col min-h-screen">
    <IndexNavbar />
    <section class="bg-cover bg-center py-6 mt-16 bg-custom-image">
      <div class="container mx-auto px-4">
        <div class="flex justify-center flex-wrap gap-4 items-center">
          <input
            type="text"
            placeholder="Môn học"
            class="px-4 py-2 rounded border border-gray-300 w-40"
          />
          <select class="px-4 py-2 rounded border border-gray-300 w-32">
            <option>Giới tính</option>
            <option value="male">Nam</option>
            <option value="female">Nữ</option>
          </select>
          <select class="px-4 py-2 rounded border border-gray-300 w-36">
            <option>Trình độ</option>
            <option value="student">Sinh viên</option>
            <option value="teacher">Giáo viên</option>
            <option value="graduated">Đã tốt nghiệp</option>
          </select>
          <select class="px-4 py-2 rounded border border-gray-300 w-40">
            <option>Khu vực</option>
            <option value="hcm">Hồ Chí Minh</option>
            <option value="hn">Hà Nội</option>
            <option value="dn">Đà Nẵng</option>
          </select>
          <a
            class="inline-block rounded-sm bg-indigo-600 px-8 py-3 text-sm font-medium text-white transition hover:scale-110 hover:shadow-xl focus:ring-3 focus:outline-hidden"
            href="#"
          >
            🔍Tìm
          </a>
        </div>
      </div>
    </section>

    <div class="flex justify-center mb-37 mt-2">
      <div
        class="flex flex-col md:flex-row justify-center w-full max-w-screen-xl align-items-stretch"
      >
        <!-- Section trái -->
        <div class="w-full xl:w-3/4 p-4 flex flex-wrap gap-4 justify-center">
          <a
            href="#"
            class="sm:w-[48%] md:w-[30%] group relative block bg-black rounded-xl overflow-hidden transform transition-transform duration-300 ease-in-out hover:scale-105"
          >
            <img
              alt=""
              src="https://images.unsplash.com/photo-1603871165848-0aa92c869fa1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=772&q=80"
              class="absolute inset-0 h-full w-full object-cover opacity-75 transition-opacity group-hover:opacity-50"
            />

            <div class="relative p-4 sm:p-6 lg:p-8">
              <p class="text-xl font-bold text-white sm:text-2xl">Tony Wayne</p>
              <div class="mt-32 sm:mt-48 lg:mt-64">
                <div
                  class="translate-y-8 transform opacity-0 transition-all group-hover:translate-y-0 group-hover:opacity-100"
                >
                  <ul class="text-sm text-white space-y-2">
                    <li class="flex items-center gap-2">
                      <!-- Địa điểm Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-pink-400"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M19 11c0 4.418-3.582 8-8 8s-8-3.582-8-8 3.582-8 8-8 8 3.582 8 8z"
                        />
                      </svg>
                      <span><strong>Địa điểm:</strong> Hà Nội</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <!-- Môn học Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-yellow-300"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M9 7v10l7-5-7-5z"
                        />
                      </svg>
                      <span><strong>Môn học:</strong> Toán, Lý, Hóa</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <!-- Trạng thái Tốt nghiệp Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-green-400"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M5 13l4 4L19 7"
                        />
                      </svg>
                      <span><strong>Trạng thái:</strong> Tốt nghiệp</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <!-- Phương thức Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-blue-300"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M9.75 17L4 12.25m0 0L9.75 7.5M4 12.25h16"
                        />
                      </svg>
                      <span><strong>Phương thức:</strong> Online </span>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </a>
          <a
            href="#"
            class="sm:w-[48%] md:w-[30%] group relative block bg-black rounded-xl overflow-hidden transform transition-transform duration-300 ease-in-out hover:scale-105"
          >
            <img
              alt=""
              src="https://images.unsplash.com/photo-1603871165848-0aa92c869fa1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=772&q=80"
              class="absolute inset-0 h-full w-full object-cover opacity-75 transition-opacity group-hover:opacity-50"
            />

            <div class="relative p-4 sm:p-6 lg:p-8">
              <p class="text-xl font-bold text-white sm:text-2xl">Tony Wayne</p>
              <div class="mt-32 sm:mt-48 lg:mt-64">
                <div
                  class="translate-y-8 transform opacity-0 transition-all group-hover:translate-y-0 group-hover:opacity-100"
                >
                  <ul class="text-sm text-white space-y-2">
                    <li class="flex items-center gap-2">
                      <!-- Địa điểm Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-pink-400"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M19 11c0 4.418-3.582 8-8 8s-8-3.582-8-8 3.582-8 8-8 8 3.582 8 8z"
                        />
                      </svg>
                      <span><strong>Địa điểm:</strong> Hà Nội</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <!-- Môn học Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-yellow-300"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M9 7v10l7-5-7-5z"
                        />
                      </svg>
                      <span><strong>Môn học:</strong> Toán, Lý, Hóa</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <!-- Trạng thái Tốt nghiệp Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-green-400"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M5 13l4 4L19 7"
                        />
                      </svg>
                      <span><strong>Trạng thái:</strong> Tốt nghiệp</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <!-- Phương thức Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-blue-300"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M9.75 17L4 12.25m0 0L9.75 7.5M4 12.25h16"
                        />
                      </svg>
                      <span><strong>Phương thức:</strong> Online </span>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </a>
          <a
            href="#"
            class="sm:w-[48%] md:w-[30%] group relative block bg-black rounded-xl overflow-hidden transform transition-transform duration-300 ease-in-out hover:scale-105"
          >
            <img
              alt=""
              src="https://images.unsplash.com/photo-1603871165848-0aa92c869fa1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=772&q=80"
              class="absolute inset-0 h-full w-full object-cover opacity-75 transition-opacity group-hover:opacity-50"
            />

            <div class="relative p-4 sm:p-6 lg:p-8">
              <p class="text-xl font-bold text-white sm:text-2xl">Tony Wayne</p>
              <div class="mt-32 sm:mt-48 lg:mt-64">
                <div
                  class="translate-y-8 transform opacity-0 transition-all group-hover:translate-y-0 group-hover:opacity-100"
                >
                  <ul class="text-sm text-white space-y-2">
                    <li class="flex items-center gap-2">
                      <!-- Địa điểm Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-pink-400"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M19 11c0 4.418-3.582 8-8 8s-8-3.582-8-8 3.582-8 8-8 8 3.582 8 8z"
                        />
                      </svg>
                      <span><strong>Địa điểm:</strong> Hà Nội</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <!-- Môn học Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-yellow-300"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M9 7v10l7-5-7-5z"
                        />
                      </svg>
                      <span><strong>Môn học:</strong> Toán, Lý, Hóa</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <!-- Trạng thái Tốt nghiệp Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-green-400"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M5 13l4 4L19 7"
                        />
                      </svg>
                      <span><strong>Trạng thái:</strong> Tốt nghiệp</span>
                    </li>
                    <li class="flex items-center gap-2">
                      <!-- Phương thức Icon -->
                      <svg
                        xmlns="http://www.w3.org/2000/svg"
                        class="h-5 w-5 text-blue-300"
                        fill="none"
                        viewBox="0 0 24 24"
                        stroke="currentColor"
                      >
                        <path
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          stroke-width="2"
                          d="M9.75 17L4 12.25m0 0L9.75 7.5M4 12.25h16"
                        />
                      </svg>
                      <span><strong>Phương thức:</strong> Online </span>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </a>
        </div>

        <!-- Section phải -->
        <div class="xl:w-1/4 p-4 flex flex-col items-center text-center">
          <h2 class="text-lg font-bold text-blue-800 sm:text-2xl sparkle">
            👨‍🏫/👩‍🏫Top gia sư tháng {{ currentMonth }}
          </h2>
          <ol class="list-decimal list-inside text-blue-700 text-md space-y-1">
            <li>Nguyễn Văn An</li>
            <li>Trần Thị Mai</li>
            <li>Phạm Quang Huy</li>
            <li>Lê Hoàng Nam</li>
            <li>Đặng Thùy Dương</li>
          </ol>
          <div class="mt-6">
            <h3 class="text-xl font-bold text-blue-600 sm:text-2xl">📚Top môn học</h3>
            <ul class="mt-4 flex flex-wrap gap-3 text-sm justify-center">
              <li>
                <a
                  class="inline-block rounded-sm bg-indigo-600 px-4 py-3 text-sm font-medium text-white transition hover:scale-110 hover:rotate-2 focus:ring-3 focus:outline-hidden"
                  href="#"
                >
                  Toán
                </a>
              </li>
              <li>
                <a
                  class="inline-block rounded-sm bg-indigo-600 px-4 py-3 text-sm font-medium text-white transition hover:scale-110 hover:rotate-2 focus:ring-3 focus:outline-hidden"
                  href="#"
                >
                  Lý
                </a>
              </li>
              <li>
                <a
                  class="inline-block rounded-sm bg-indigo-600 px-4 py-3 text-sm font-medium text-white transition hover:scale-110 hover:rotate-2 focus:ring-3 focus:outline-hidden"
                  href="#"
                >
                  Hóa
                </a>
              </li>
              <li>
                <a
                  class="inline-block rounded-sm bg-indigo-600 px-4 py-3 text-sm font-medium text-white transition hover:scale-110 hover:rotate-2 focus:ring-3 focus:outline-hidden"
                  href="#"
                >
                  Tiếng Anh
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
    <FooterDown />
  </div>
</template>
<script>
import IndexNavbar from '../components/Navbars/IndexNavbar.vue'
import FooterDown from '../components/Footers/Footer.vue'
export default {
  name: 'TutorView',
  components: { IndexNavbar, FooterDown },
  data() {
    return {
      currentMonth: '',
    }
  },
  created() {
    const monthNames = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12']
    const now = new Date()
    this.currentMonth = monthNames[now.getMonth()]
  },
}
</script>

<style scoped>
.bg-custom-image {
  background-image: url('../assets/img/bg-pattern.png');
}

@keyframes sparkle {
  0%,
  100% {
    opacity: 1;
    transform: scale(1);
  }
  50% {
    opacity: 0.6;
    transform: scale(1.05);
  }
}

.sparkle {
  animation: sparkle 1.5s ease-in-out infinite;
}
</style>
