<template>
  <IndexNavbar />

  <!-- search bar -->
  <section class="bg-cover bg-center py-6 mt-16 bg-custom-image">
    <div class="container mx-auto px-4">
      <div class="flex justify-center flex-wrap gap-4 items-center">
        <select class="px-4 py-2 rounded border border-gray-300 w-40" v-model="subject">
          <option :value="0">Môn học</option>
          <option :value="0">Tất cả</option>
          <option v-for="(item, index) in subjects" :key="index" :value="item.id">
            {{ item.name }}
          </option>
        </select>
        <select class="px-4 py-2 rounded border border-gray-300 w-40" v-model="level">
          <option :value="0">Trình độ</option>
          <option :value="0">Tất cả</option>
          <option v-for="(item, index) in levels" :key="index" :value="item.id">
            {{ item.name }}
          </option>
        </select>
        <select class="px-4 py-2 rounded border border-gray-300 w-40" v-model="location">
          <option :value="0">Khu vực</option>
          <option :value="0">Tất cả</option>
          <option v-for="(item, index) in locations" :key="index" :value="item.id">
            {{ item.name }}
          </option>
        </select>
        <select class="px-4 py-2 rounded border border-gray-300 w-40" v-model="mode">
          <option :value="''">Hình thức học</option>
          <option :value="''">Tất cả</option>
          <option :value="'offline'">Offline</option>
          <option :value="'online'">Online</option>
        </select>
        <router-link
          class="inline-block rounded-sm bg-indigo-600 px-8 py-3 text-sm font-medium text-white transition hover:scale-110 hover:shadow-xl focus:ring-3 focus:outline-hidden"
          :to="{
            query: {
              subjectId: subject,
              levelId: level,
              locationId: location,
              learningMode: mode,
            },
          }"
        >
          Tìm
        </router-link>
      </div>
    </div>
  </section>

  <div class="container mx-auto px-4 py-4">
    <!-- content -->
    <div class="grid lg:grid-cols-4 px-4 py-4">
      <div class="rounded lg:col-span-3 mb-4">
        <!-- load from database -->
        <div class="rounded p-4" v-for="(item, index) in classes" :key="index">
          <div class="max-w-3xl mx-auto p-6 bg-white rounded-xl shadow-md space-y-6">
            <div>
              <h1 class="text-xl font-semibold text-gray-800">Yêu cầu: {{ item.requirements }}</h1>
            </div>

            <div class="grid gap-4 lg:grid-cols-2 lg:gap-8">
              <div class="rounded">
                <p class="text-sm text-gray-500">
                  Mã lớp: <span class="font-bold">{{ item.id }}</span> ·
                  <a href="#" class="text-red-500 hover:underline">Xem thêm</a>
                </p>
                <div class="text-lg">
                  <span class="font-semibold">Số học viên: </span>
                  <span class="text-green-600 font-bold">{{ item.numberOfStudents }}</span>
                </div>
              </div>
              <div class="rounded">
                <div class="flex items-center justify-center bg-green-100 px-4 rounded">
                  <button
                    class="bg-green-500 text-white font-semibold px-4 py-2 rounded hover:bg-green-600"
                  >
                    <span class="text-yellow-500">Nhận lớp ngay </span>
                    <span class="text-green-600 font-bold">({{ item.status }}) </span>
                  </button>
                </div>
              </div>
            </div>

            <div class="p-4 bg-gray-50 border rounded text-sm italic text-gray-600">
              <i class="fa-solid fa-person-chalkboard"></i>
              <span class="font-semibold">
                Yêu cầu gia sư giảng dạy:
                <span v-if="item.preferredTutor != null">{{ item.preferredTutor }}</span>
                <span v-else>Không có</span>
              </span>
            </div>

            <div class="grid lg:grid-cols-2 text-sm text-gray-700">
              <div class="grid-cols-1 gap-4">
                <div class="flex items-center space-x-2 py-2">
                  <i class="fa fa-clock"></i>
                  <p><span class="font-semibold">Tạo lúc: </span>{{ item.createdAt }}</p>
                </div>
                <div class="flex items-center space-x-2 py-2">
                  <i class="fa fa-user"></i>
                  <p><span class="font-semibold">Người đăng: </span>{{ item.postedBy.fullName }}</p>
                </div>
                <div class="flex items-center space-x-2 py-2">
                  <i class="fa fa-map-marker-alt"></i>
                  <p><span class="font-semibold">Địa điểm: </span>{{ item.location.name }}</p>
                </div>
                <div class="flex items-center space-x-2 py-2">
                  <i class="fa fa-calendar"></i>
                  <p><span class="font-semibold">Lịch học: </span>{{ item.schedule }}</p>
                </div>
              </div>

              <div class="grid-cols-1 gap-4">
                <div class="flex items-center space-x-2 py-2">
                  <i class="fa fa-book"></i>
                  <p><span class="font-semibold">Môn học: </span>{{ item.subject.name }}</p>
                </div>
                <div class="flex items-center space-x-2 py-2">
                  <i class="fa-solid fa-turn-up"></i>
                  <p><span class="font-semibold">Trình độ: </span>{{ item.level.name }}</p>
                </div>
                <div class="flex items-center space-x-2 py-2">
                  <i class="fas fa-laptop"></i>
                  <p><span class="font-semibold">Hình thức học: </span>{{ item.learningMode }}</p>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- pagination -->
        <ul class="flex justify-center gap-1 text-gray-900">
          <li v-if="currentPage > 0">
            <router-link
              :to="{
                query: {
                  page: currentPage - 1,
                  subjectId: subject,
                  levelId: level,
                  locationId: location,
                  learningMode: mode,
                },
              }"
              class="grid size-8 place-content-center rounded border border-gray-200 transition-colors hover:bg-gray-50 rtl:rotate-180"
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
            </router-link>
          </li>

          <li v-for="(page, index) in totalPages" :key="index">
            <router-link
              :to="{
                query: {
                  page: page - 1,
                  subjectId: subject,
                  levelId: level,
                  locationId: location,
                  learningMode: mode,
                },
              }"
              :class="{
                'block size-8 rounded border text-center text-sm/8 font-medium transition-colors hover:bg-gray-50': true,
                'bg-indigo-600 text-white': currentPage === page - 1,
              }"
            >
              {{ page }}
            </router-link>
          </li>

          <li v-if="currentPage < totalPages - 1">
            <router-link
              :to="{
                query: {
                  page: currentPage + 1,
                  subjectId: subject,
                  levelId: level,
                  locationId: location,
                  learningMode: mode,
                },
              }"
              class="grid size-8 place-content-center rounded border border-gray-200 transition-colors hover:bg-gray-50 rtl:rotate-180"
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
            </router-link>
          </li>
        </ul>
      </div>

      <div class="rounded mb-4">
        <!-- Đăng ký gia sư -->
        <div class="rounded text-center bg-gray-300 mb-4 py-4 px-4">
          <p class="mb-4">"Bạn đã tham gia đội ngũ Gia Sư của chúng tôi chưa?"</p>
          <router-link
            class="inline-block rounded-sm bg-red-500 px-8 py-3 text-sm font-medium text-white transition hover:scale-110 hover:shadow-xl focus:ring-3 focus:outline-hidden"
            :to="'/auth/register'"
          >
            ĐĂNG KÝ LÀM GIA SƯ
          </router-link>
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
  </div>

  <br />

  <FooterComponent />
</template>

<script setup>
import IndexNavbar from '@/components/Navbars/IndexNavbar.vue'
import FooterComponent from '@/components/Footers/Footer.vue'
import { onMounted, ref, watch } from 'vue'
import axios from 'axios'
import { useRoute } from 'vue-router'

// Router
const route = useRoute()

// URL
const url = import.meta.env.VITE_API_BASE_URL

// Reactive data
const classes = ref([])
const subjects = ref([])
const levels = ref([])
const locations = ref([])
const currentPage = ref(0)
const totalPages = ref(0)
const pageSize = ref(10)
const subject = ref(0)
const level = ref(0)
const location = ref(0)
const mode = ref('')
const status = ref('')

// dữ liệu mẫu lớp học phổ biến
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

// Hàm lấy dữ liệu lớp học từ API
async function getClasses() {
  try {
    const response = await axios.get(`${url}/lop-moi`, {
      params: {
        page: currentPage.value,
        size: pageSize.value,
        subjectId: subject.value,
        levelId: level.value,
        locationId: location.value,
        learningMode: mode.value,
        status: status.value,
      },
    })
    classes.value = response.data.content
    totalPages.value = response.data.totalPages
    currentPage.value = response.data.number
  } catch (error) {
    console.error('Lỗi khi lấy danh sách lớp:', error)
  }
}

// Hàm lấy dữ liệu cho thanh tìm kiếm từ API
async function getFilters() {
  try {
    const response = await axios.get(`${url}/filter-options`)
    subjects.value = response.data.subjects
    levels.value = response.data.levels
    locations.value = response.data.locations
  } catch (error) {
    console.error('Lỗi khi lấy danh sách bộ lọc:', error)
  }
}

// Theo dõi query param từ URL → gọi API
watch(
  () => route.query,
  (query) => {
    currentPage.value = parseInt(query.page) || 0
    subject.value = parseInt(query.subjectId) || 0
    level.value = parseInt(query.levelId) || 0
    location.value = parseInt(query.locationId) || 0
    mode.value = query.learningMode || ''
    getClasses() // đổ dữ liệu lớp học
  },
  { immediate: true },
)

// Khi component được nạp, đọc page từ URL → gọi API
onMounted(() => {
  getFilters() // nạp dữ liệu cho thanh tìm kiếm
})
</script>

<style scoped>
.bg-custom-image {
  background-image: url('@/assets/img/bg-pattern.png');
}
</style>
