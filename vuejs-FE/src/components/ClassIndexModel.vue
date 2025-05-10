<template>
  <!-- Overlay -->
  <div
    v-if="visible"
    class="fixed inset-0 z-50 flex items-center justify-center backdrop-blur-sm bg-black/20"
  >
    <!-- Modal Container -->
    <div class="bg-white rounded-lg w-full max-w-lg shadow-lg overflow-hidden">
      <!-- Header -->
      <div
        class="bg-[#449d44] text-white text-xl font-semibold p-4 flex justify-between items-center"
      >
        <span>Đăng ký nhận lớp</span>
        <button @click="close" class="text-white text-2xl font-bold leading-none">&times;</button>
      </div>

      <!-- Body -->
      <div class="p-6 text-center space-y-6">
        <p class="text-lg font-medium mb-4">
          Vui lòng đăng ký làm gia sư trước<br />sau đó mới nhận lớp!!!
        </p>

        <!-- Đăng ký làm gia sư -->
        <router-link
          class="w-64 inline-block rounded-sm bg-red-500 px-8 py-3 text-sm font-medium text-white transition hover:scale-110 hover:shadow-xl focus:ring-3 focus:outline-hidden"
          :to="'/auth/register'"
        >
          ĐĂNG KÝ LÀM GIA SƯ
        </router-link>

        <!-- Đăng nhập -->
        <div class="text-sm text-gray-700 font-semibold">
          Nếu đã đăng ký trước đó rồi, hãy bấm vào nút <br />
          dưới để <span class="text-green-600 font-semibold">đăng nhập</span> và sau đó nhận lớp
        </div>
        <router-link
          class="w-64 inline-block rounded-sm bg-sky-500 px-8 py-3 text-sm font-medium text-white transition hover:scale-110 hover:shadow-xl focus:ring-3 focus:outline-hidden"
          :to="'/auth/login'"
        >
          ĐĂNG NHẬP
        </router-link>

        <!-- Hướng dẫn hỗ trợ -->
        <div class="text-sm text-gray-600 leading-relaxed font-semibold">
          Nếu bạn gặp bất kỳ khó khăn nào hãy liên hệ với chúng tôi qua số<br />
          <span class="text-red-600 font-bold">093 143 9203</span> hoặc
          <span class="text-red-600 font-bold">098 707 5826</span><br />
          hoặc Chat ngay với chúng tôi để được hỗ trợ nhanh nhất
        </div>

        <!-- Messenger Icon -->
        <div class="flex justify-center">
          <svg
            xmlns="http://www.w3.org/2000/svg"
            width="32"
            height="32"
            fill="skyblue"
            class="bi bi-messenger"
            viewBox="0 0 16 16"
          >
            <path
              d="M0 7.76C0 3.301 3.493 0 8 0s8 3.301 8 7.76-3.493 7.76-8 7.76c-.81 0-1.586-.107-2.316-.307a.64.64 0 0 0-.427.03l-1.588.702a.64.64 0 0 1-.898-.566l-.044-1.423a.64.64 0 0 0-.215-.456C.956 12.108 0 10.092 0 7.76m5.546-1.459-2.35 3.728c-.225.358.214.761.551.506l2.525-1.916a.48.48 0 0 1 .578-.002l1.869 1.402a1.2 1.2 0 0 0 1.735-.32l2.35-3.728c.226-.358-.214-.761-.551-.506L9.728 7.381a.48.48 0 0 1-.578.002L7.281 5.98a1.2 1.2 0 0 0-1.735.32z"
            />
          </svg>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
defineProps({
  visible: {
    type: Boolean,
    default: false,
  },
})

const emit = defineEmits(['close'])
const close = () => emit('close')
</script>
