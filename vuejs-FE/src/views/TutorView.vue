<template>
  <div class="flex flex-col min-h-screen">
    <IndexNavbar />

    <div class="flex-grow">
      <h1 class="text-center text-2xl mt-4">Trang Gia Sư</h1>
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
