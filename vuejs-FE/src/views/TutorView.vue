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

    <div class="flex justify-center mt-auto mb-37">
      <div class="flex w-full max-w-screen-xl">
        <!-- Section trái -->
        <div class="w-3/4 bg-gray-200 p-4">
          <h2 class="text-xl font-bold">Section trái</h2>
          <p>Đây là section trái, chiếm 75% chiều rộng.</p>
        </div>

        <!-- Section phải -->
        <div class="w-1/4 bg-gray-400 p-4">
          <h2 class="text-xl font-bold">Section phải</h2>
          <p>Đây là section phải, chiếm 25% chiều rộng.</p>
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
}
</script>

<style scoped>
.bg-custom-image {
  background-image: url('../assets/img/bg-pattern.png');
}
</style>
