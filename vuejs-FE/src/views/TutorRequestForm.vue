<template>
  <Navbar />
  <div class="max-w-4xl mx-auto p-6 bg-white rounded shadow space-y-8 mt-16">
    <h2 class="text-2xl font-bold border-b pb-2">Mô tả yêu cầu tìm gia sư</h2>

    <!-- Tổng quan yêu cầu -->
    <div class="grid grid-cols-1 md:grid-cols-2 gap-4">
      <label>
        Tóm tắt yêu cầu (tối đa 20 từ) *
        <input v-model="summary" type="text" placeholder="Tóm tắt yêu cầu (tối đa 20 từ) *" class="input" />
      </label>
      <label>
        Địa điểm dạy *
        <input v-model="location" type="text" placeholder="Địa điểm dạy *" class="input" />
      </label>
      <label>
        Số học viên *
        <input v-model="studentCount" type="number" placeholder="Số học viên *" class="input" />
      </label>
      <label>
        Ngày bắt đầu *
        <input v-model="startDate" type="date" placeholder="Ngày bắt đầu *" class="input" />
      </label>
      <label>
        Thời lượng mỗi buổi *
        <select v-model="sessionTime" class="input">
          <option>60 phút</option>
          <option>90 phút</option>
          <option>120 phút</option>
        </select>
      </label>
      <label>
        Môn học *
        <div class="relative mt-2">
          <button
            type="button"
            class="w-full cursor-default rounded-md bg-white py-2 pl-3 pr-10 text-left shadow-sm ring-1 ring-gray-300 focus:outline-none focus:ring-2 focus:ring-indigo-600 sm:text-sm"
            @click="toggleDropdown"
          >
            <span class="block truncate">
              {{ selectedSubjects.length > 0 ? selectedSubjects.join(', ') : 'Chọn môn học' }}
            </span>
            <span class="absolute inset-y-0 right-0 flex items-center pr-2 pointer-events-none">
              <svg class="h-5 w-5 text-gray-400" viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
                <path
                  fill-rule="evenodd"
                  d="M5.23 7.21a.75.75 0 011.06.02L10 10.94l3.72-3.72a.75.75 0 111.06 1.06l-4.25 4.25a.75.75 0 01-1.06 0L5.23 8.27a.75.75 0 01.02-1.06z"
                  clip-rule="evenodd"
                />
              </svg>
            </span>
          </button>

          <ul
            v-if="isDropdownOpen"
            class="absolute z-10 mt-1 max-h-56 w-full overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black/5 focus:outline-none sm:text-sm"
          >
            <li
              v-for="subject in subjectOptions"
              :key="subject.id"
              class="relative cursor-default select-none py-2 pl-3 pr-9 text-gray-900 hover:bg-indigo-600 hover:text-white"
              @click="toggleSubject(subject.text)"
            >
              <span class="block truncate">{{ subject.text }}</span>
              <span
                v-if="selectedSubjects.includes(subject.text)"
                class="absolute inset-y-0 right-0 flex items-center pr-4 text-indigo-600"
              >
                <svg class="h-5 w-5" viewBox="0 0 20 20" fill="currentColor" aria-hidden="true">
                  <path
                    fill-rule="evenodd"
                    d="M16.704 4.153a.75.75 0 0 1 .143 1.052l-8 10.5a.75.75 0 0 1-1.127.075l-4.5-4.5a.75.75 0 0 1 1.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 0 1 1.05-.143Z"
                    clip-rule="evenodd"
                  />
                </svg>
              </span>
            </li>
          </ul>
        </div>
      </label>
    </div>

    <!-- Giới tính học viên -->
    <div class="space-x-4">
      <span>Giới tính học viên:</span>
      <label><input type="radio" value="Nam" v-model="studentGender" /> Nam</label>
      <label><input type="radio" value="Nữ" v-model="studentGender" /> Nữ</label>
      <label><input type="radio" value="Cả hai" v-model="studentGender" /> Có cả Nam và Nữ</label>
    </div>

    <!-- Thời gian học -->
    <div>
      <label class="block mb-2 font-semibold">Thời gian có thể học *</label>
      <div class="overflow-x-auto">
        <div class="time-schedule">
          <div v-for="(day, dayIndex) in days" :key="dayIndex" class="day-row">
            <div class="day-label">{{ day }}</div>
            <div class="hours">
              <button
                v-for="hour in 24"
                :key="hour"
                class="hour-button"
                :class="{ active: selectedHours[dayIndex]?.includes(hour) }"
                @click="toggleHourSelection(dayIndex, hour)"
              >
                {{ hour }}
              </button>
            </div>
          </div>
        </div>
        <small class="text-xs mt-2 block">* Thời gian được hiển thị từ 0h đến 23h</small>
      </div>
    </div>

    <!-- Yêu cầu gia sư -->
    <h2 class="text-xl font-semibold border-b pb-2">Yêu cầu gia sư</h2>
    <div class="grid grid-cols-1 md:grid-cols-5 gap-4 items-center">
      <div>
        <label class="block font-medium mb-1">Giới tính</label>
        <select v-model="tutorGender" class="input">
          <option>Nam</option>
          <option>Nữ</option>
          <option>Tùy</option>
        </select>
      </div>
      <div>
        <label class="block font-medium mb-1">Trình độ</label>
        <select v-model="level" class="input">
          <option>Sinh viên</option>
          <option>Giáo viên</option>
          <option>Thạc sĩ</option>
        </select>
      </div>
      <div>
        <label class="block font-medium mb-1">Học phí (vnđ)</label>
        <input v-model="fee" type="text" placeholder="vd: 300000" class="input" />
      </div>
      <div>
        <label class="block font-medium mb-1">Theo</label>
        <select v-model="feeType" class="input">
          <option>Buổi</option>
          <option>Tháng</option>
        </select>
      </div>
      <div>
        <label class="block font-medium mb-1">Buổi / Tuần</label>
        <input v-model="sessionsPerWeek" type="text" placeholder="vd: 3" class="input" />
      </div>
    </div>
    <div>
      <label class="block font-medium mb-1">Mô tả chi tiết *</label>
      <textarea v-model="description" rows="4" placeholder="Mô tả chi tiết" class="input resize-none"></textarea>
    </div>
    <div>
      <label class="block font-medium mb-1">CODE khuyến mãi</label>
      <input v-model="promoCode" type="text" placeholder="code" class="input" />
    </div>
    <div class="text-green-500 text-xl font-bold text-center">
      90,000đ/buổi
    </div>
    <div>
      <button class="bg-green-500 text-white px-6 py-2 rounded hover:bg-green-600">
        Đăng yêu cầu
      </button>
    </div>
  </div>
  <FooterComponent class="mt-16" />
</template>

<script setup>
import Navbar from "@/components/Navbars/AuthNavbar.vue";
import FooterComponent from "@/components/Footers/Footer.vue";
import { ref } from 'vue';

const summary = ref('');
const location = ref('');
const studentCount = ref(1);
const startDate = ref('');
const sessionTime = ref('');
const selectedSubjects = ref([]);
const subjectOptions = ref([
  { id: 303, text: '2D' },
  { id: 307, text: '3D Max' },
  { id: 310, text: 'Photoshop' },
  { id: 315, text: 'Illustrator' },
]); // Danh sách các môn học có thể chọn
const isDropdownOpen = ref(false);
const studentGender = ref('Nam');
const tutorGender = ref('Tùy');
const level = ref('Sinh viên');
const fee = ref('');
const feeType = ref('Buổi');
const sessionsPerWeek = ref('');
const description = ref('');
const promoCode = ref('');
const days = ref(['Thứ 2', 'Thứ 3', 'Thứ 4', 'Thứ 5', 'Thứ 6', 'Thứ 7', 'Chủ nhật']);
const selectedHours = ref(Array(days.value.length).fill([]));

function toggleDropdown() {
  isDropdownOpen.value = !isDropdownOpen.value;
}

function toggleSubject(subject) {
  if (selectedSubjects.value.includes(subject)) {
    selectedSubjects.value = selectedSubjects.value.filter((s) => s !== subject);
  } else {
    selectedSubjects.value.push(subject);
  }
}

function toggleHourSelection(dayIndex, hour) {
  const hours = selectedHours.value[dayIndex];
  if (hours.includes(hour)) {
    selectedHours.value[dayIndex] = hours.filter(h => h !== hour);
  } else {
    selectedHours.value[dayIndex] = [...hours, hour];
  }
}
</script>

<style scoped>
.input {
  border: 1px solid #ccc;
  padding: 8px;
  border-radius: 4px;
  width: 100%;
}

/* Tùy chỉnh giao diện cho <select> */
.input[multiple] {
  height: auto;
  min-height: 100px;
  overflow-y: auto;
}

.time-schedule {
  display: flex;
  flex-direction: column;
  gap: 8px;
}

.day-row {
  display: flex;
  align-items: center;
  gap: 8px;
}

.day-label {
  width: 60px;
  font-weight: bold;
  text-align: left;
}

.hours {
  display: grid;
  grid-template-columns: repeat(24, 1fr);
  gap: 4px;
  flex: 1;
}

.hour-button {
  padding: 4px;
  border: 1px solid #ccc;
  border-radius: 4px;
  text-align: center;
  cursor: pointer;
  background-color: white;
}

.hour-button.active {
  background-color: #38a169;
  color: white;
}

.hour-button:hover {
  background-color: #f0f0f0;
}

/* Tùy chỉnh giao diện dropdown */
</style>
