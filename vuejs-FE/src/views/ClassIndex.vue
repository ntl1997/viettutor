<template>
  <IndexNavbar />

  <!-- search bar -->
  <section class="bg-cover bg-center py-6 mt-16 bg-custom-image">
    <div class="container mx-auto px-4">
      <div class="flex justify-center flex-wrap gap-4 items-center">
        <input
          type="text"
          placeholder="Môn học"
          class="px-4 py-2 rounded border border-gray-300 w-40"
        />
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
          Tìm
        </a>
      </div>
    </div>
  </section>

  <br />

  <!-- content -->
  <div class="container mx-auto px-4 py-4">
    <div class="grid lg:grid-cols-4 px-4 py-4">
      <div class="rounded lg:col-span-3">
        <div class="rounded p-4">
          <div class="max-w-3xl mx-auto p-6 bg-white rounded-xl shadow-md space-y-6">
            <div>
              <h1 class="text-xl font-semibold text-gray-800">
                Yêu cầu: Giao tiếp bằng Tiếng Hàn để học môn Tiếng Việt
              </h1>
            </div>

            <div class="grid gap-4 lg:grid-cols-2 lg:gap-8">
              <div class="rounded">
                <p class="text-sm text-gray-500">
                  Mã lớp: <span class="font-bold">24320</span> ·
                  <a href="#" class="text-red-500 hover:underline">Xem thêm</a>
                </p>
                <div class="text-lg">
                  <span class="font-semibold">Số học viên:</span>
                  <span class="text-green-600 font-bold">1</span>
                </div>
              </div>
              <div class="rounded">
                <div class="flex items-center justify-center bg-green-100 px-4 rounded">
                  <button
                    class="bg-green-500 text-white font-semibold px-4 py-2 rounded hover:bg-green-600"
                  >
                    <span class="text-yellow-500">Nhận lớp ngay </span>
                    <span class="text-green-600 font-bold">(pending) </span>
                  </button>
                </div>
              </div>
            </div>

            <div class="p-4 bg-gray-50 border rounded text-sm italic text-gray-600">
              <i class="fa-solid fa-person-chalkboard"></i>
              <span class="font-semibold"> Yêu cầu gia sư giảng dạy: không có</span>
            </div>

            <div class="grid grid-cols-1 sm:grid-cols-2 gap-4 text-sm text-gray-700">
              <div class="flex items-center space-x-2">
                <i class="fa fa-clock"></i>
                <span>Tạo lúc: 11:07 06.05.2025</span>
              </div>
              <div class="flex items-center space-x-2">
                <i class="fa fa-user"></i>
                <span>Người đăng: 1</span>
              </div>
              <div class="flex items-center space-x-2">
                <i class="fa fa-map-marker-alt"></i>
                <span>Địa điểm: Long Biên, Hà Nội</span>
              </div>
              <div class="flex items-center space-x-2">
                <i class="fa fa-calendar"></i>
                <span>Lịch học: Tất cả các ngày 17h đến 20h</span>
              </div>
              <div class="flex items-center space-x-2">
                <i class="fa fa-book"></i>
                <span>Môn học: Tiếng Việt</span>
              </div>
              <div class="flex items-center space-x-2">
                <i class="fa-solid fa-turn-up"></i>
                <span>Trình độ: Tiếng Việt lớp 1</span>
              </div>
              <div class="flex items-center space-x-2">
                <i class="fas fa-laptop"></i>
                <span>Hình thức học: Offline</span>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="rounded">
        <!-- Đăng ký gia sư -->
        <div class="rounded text-center bg-gray-300 mb-4 py-4 px-4">
          <p class="mb-4">"Bạn đã tham gia đội ngũ Gia Sư của chúng tôi chưa?"</p>
          <button class="bg-red-500 hover:bg-red-600 text-white font-semibold py-2 px-6 rounded">
            ĐĂNG KÝ LÀM GIA SƯ
          </button>
        </div>

        <!-- Hộp gọi hỗ trợ -->
        <div class="bg-gray-700 text-center text-yellow-300 py-6 mb-4 rounded">
          <p class="text-lg font-bold">Hãy gọi ngay:</p>
          <p class="text-2xl font-bold text-white mt-2">093 143 9203</p>
          <p class="mt-2">hoặc</p>
          <p class="text-2xl font-bold text-white mt-2">098 707 5826</p>
          <p class="mt-2 font-bold">để được hỗ trợ</p>
        </div>

        <!-- Lớp phổ biến -->
        <div>
          <h2 class="text-green-600 font-semibold mb-2 border-b border-gray-200 pb-1">
            Lớp phổ biến
          </h2>
          <div class="flex flex-wrap gap-2">
            <span
              v-for="(tag, index) in popularClasses"
              :key="index"
              class="border px-3 py-1 rounded text-sm bg-white hover:bg-gray-100 cursor-pointer"
            >
              {{ tag }}
            </span>
          </div>
        </div>
      </div>
    </div>

    <!-- pagination -->
    <ul class="flex justify-center gap-1 text-gray-900 dark:text-white">
      <li>
        <a
          href="#"
          class="grid size-8 place-content-center rounded border border-gray-200 transition-colors hover:bg-gray-50 rtl:rotate-180 dark:border-gray-700 dark:hover:bg-gray-800"
          aria-label="Previous page"
        >
          <svg
            xmlns="http://www.w3.org/2000/svg"
            class="size-4"
            viewBox="0 0 20 20"
            fill="currentColor"
          >
            <path
              fill-rule="evenodd"
              d="M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z"
              clip-rule="evenodd"
            />
          </svg>
        </a>
      </li>

      <li>
        <a
          href="#"
          class="block size-8 rounded border border-gray-200 text-center text-sm/8 font-medium transition-colors hover:bg-gray-50 dark:border-gray-700 dark:hover:bg-gray-800"
        >
          1
        </a>
      </li>

      <li
        class="block size-8 rounded border border-indigo-600 bg-indigo-600 text-center text-sm/8 font-medium text-white"
      >
        2
      </li>

      <li>
        <a
          href="#"
          class="block size-8 rounded border border-gray-200 text-center text-sm/8 font-medium transition-colors hover:bg-gray-50 dark:border-gray-700 dark:hover:bg-gray-800"
        >
          3
        </a>
      </li>

      <li>
        <a
          href="#"
          class="block size-8 rounded border border-gray-200 text-center text-sm/8 font-medium transition-colors hover:bg-gray-50 dark:border-gray-700 dark:hover:bg-gray-800"
        >
          4
        </a>
      </li>

      <li>
        <a
          href="#"
          class="grid size-8 place-content-center rounded border border-gray-200 transition-colors hover:bg-gray-50 rtl:rotate-180 dark:border-gray-700 dark:hover:bg-gray-800"
          aria-label="Next page"
        >
          <svg
            xmlns="http://www.w3.org/2000/svg"
            class="size-4"
            viewBox="0 0 20 20"
            fill="currentColor"
          >
            <path
              fill-rule="evenodd"
              d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z"
              clip-rule="evenodd"
            />
          </svg>
        </a>
      </li>
    </ul>
  </div>

  <br />
  <br />

  <FooterComponent />
</template>

<script setup>
import IndexNavbar from '@/components/Navbars/IndexNavbar.vue'
import FooterComponent from '@/components/Footers/Footer.vue'

const popularClasses = [
  'Đàn Guitar',
  'Đàn Piano',
  'Trẻ chậm nói',
  'YOGA',
  'Đàn Violin',
  'Tiếng Việt Lớp 1',
  'Nhảy hiện đại (Dance)',
  'Toán Lớp 1',
  'Đàn Organ',
  'Tiếng Trung',
  'Vẽ',
  'Tiếng Hàn',
  'Khiêu Vũ giao tiếp',
  'Toán lớp 9',
  'Thanh nhạc',
  'Toán lớp 8',
  'Lập trình',
  'Tiếng Anh Giao tiếp',
  'Tin học văn phòng',
  'Tiếng Việt cho người nước ngoài',
]
</script>

<style scoped>
.bg-custom-image {
  background-image: url('@/assets/img/bg-pattern.png');
}
</style>
