<template>
  <nav
    class="fixed top-0 left-0 w-full bg-white shadow z-50 flex flex-wrap items-center justify-between px-2 py-3 navbar-expand-lg"
  >
    <div class="container px-4 mx-auto flex flex-wrap items-center justify-between">
      <div
        class="w-full relative flex justify-between lg:w-auto lg:static lg:block lg:justify-start"
      >
        <router-link
          class="text-gray-800 text-lg font-bold leading-relaxed inline-block mr-4 py-2 whitespace-nowrap uppercase"
          to="/"
        >
          VietTutor
        </router-link>
        <button
          class="cursor-pointer text-xl leading-none px-3 py-1 border border-solid border-transparent rounded bg-transparent block lg:hidden outline-none focus:outline-none"
          type="button"
          v-on:click="setNavbarOpen"
        >
          <i class="text-gray-800 fas fa-bars"></i>
        </button>
      </div>
      <div
        class="lg:flex flex-grow items-center bg-white lg:bg-opacity-0 lg:shadow-none"
        :class="[navbarOpen ? 'block rounded shadow-lg' : 'hidden']"
        id="example-navbar-warning"
      >
        <ul class="flex flex-col lg:flex-row list-none lg:ml-auto">
          <li class="flex items-center">
            <router-link
              to="/"
              class="text-gray-800 hover:text-gray-600 px-3 py-4 lg:py-2 flex items-center text-xs uppercase font-bold"
            >
              Lớp mới
            </router-link>
          </li>

          <li class="flex items-center">
            <router-link
              to="/"
              class="text-gray-800 hover:text-gray-600 px-3 py-4 lg:py-2 flex items-center text-xs uppercase font-bold"
            >
              Gia sư
            </router-link>
          </li>

          <li class="flex items-center">
            <router-link
              to="/"
              class="text-gray-800 hover:text-gray-600 px-3 py-4 lg:py-2 flex items-center text-xs uppercase font-bold"
            >
              Học phí tham khảo
            </router-link>
          </li>

          <li class="flex items-center">
            <router-link
              to="/"
              class="text-gray-800 hover:text-gray-600 px-3 py-4 lg:py-2 flex items-center text-xs uppercase font-bold"
            >
              Tìm gia sư
            </router-link>
          </li>

          <li class="flex items-center">
            <router-link
              to="/"
              class="text-gray-800 hover:text-gray-600 px-3 py-4 lg:py-2 flex items-center text-xs uppercase font-bold"
            >
              Đăng ký làm gia sư
            </router-link>
          </li>

          <li class="flex items-center">
            <router-link
              to="/"
              class="text-gray-800 hover:text-gray-600 px-3 py-4 lg:py-2 flex items-center text-xs uppercase font-bold"
            >
              Bài viết
            </router-link>
          </li>

          <li class="flex items-center">
            <router-link
              to="/"
              class="text-gray-800 hover:text-gray-600 px-3 py-4 lg:py-2 flex items-center text-xs uppercase font-bold"
            >
              Liên hệ
            </router-link>
          </li>

          <li class="flex items-center">
            <PagesDropdown />
          </li>

          <li class="flex items-center">
            <router-link
              to="/auth/login"
              class="bg-emerald-500 text-white active:bg-emerald-600 text-xs font-bold uppercase px-4 py-2 rounded shadow hover:shadow-lg outline-none focus:outline-none lg:mr-1 lg:mb-0 ml-3 mb-3 ease-linear transition-all duration-150"
            >
              Đăng nhập
            </router-link>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script>
import PagesDropdown from '@/components/Dropdowns/PagesDropdown.vue'
export default {
  data() {
    return {
      navbarOpen: false,
    }
  },
  methods: {
    setNavbarOpen: function () {
      this.navbarOpen = !this.navbarOpen
    },
  },
  components: {
    PagesDropdown,
  },
}
</script>

<style scoped>
/* Ensure the navbar is fixed at the top */
nav {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  z-index: 50; /* Ensure it stays above other elements */
  background-color: white; /* Match the background color */
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); /* Add a subtle shadow */
}
</style>
