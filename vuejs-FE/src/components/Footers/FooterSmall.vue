<template>
  <footer
    class="pb-6"
    :class="[absolute ? 'absolute w-full bottom-0 bg-blueGray-800' : 'relative']"
  >
    <div class="container mx-auto px-4">
      <hr class="mb-6 border-b-1 border-blueGray-600" />
      <div class="flex flex-wrap items-center md:justify-between justify-center">
        <div class="w-full md:w-4/12 px-4">
          <div class="text-sm text-blueGray-500 font-semibold py-1 text-center md:text-left">
            Copyright © {{ date }}
            <a
              href="https://www.creative-tim.com?ref=vn-footer-small"
              class="text-white hover:text-blueGray-300 text-sm font-semibold py-1"
            >
              VietTutor
            </a>
          </div>
        </div>
        <div class="w-full md:w-8/12 px-4">
          <ul class="flex flex-wrap list-none md:justify-end justify-center">
            <li>
              <a
                href="https://www.creative-tim.com?ref=vn-footer-small"
                class="text-white hover:text-blueGray-300 text-sm font-semibold block py-1 px-3"
              >
                Viettutor
              </a>
            </li>
            <li>
              <a
                href="https://www.creative-tim.com/presentation?ref=vn-footer-small"
                class="text-white hover:text-blueGray-300 text-sm font-semibold block py-1 px-3"
              >
                Về chúng tôi
              </a>
            </li>
            <li>
              <a
                href="http://blog.creative-tim.com?ref=vn-footer-small"
                class="text-white hover:text-blueGray-300 text-sm font-semibold block py-1 px-3"
              >
                Blog
              </a>
            </li>
            <li>
              <a
                href="https://github.com/creativetimofficial/vue-notus/blob/main/LICENSE.md?ref=vn-footer-small"
                class="text-white hover:text-blueGray-300 text-sm font-semibold block py-1 px-3"
              >
                Giấy phép MIT
              </a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </footer>
</template>

<script>
export default {
  data() {
    return {
      date: new Date().getFullYear(),
    }
  },
  props: {
    absolute: {
      type: Boolean,
      default: false,
    },
  },
}
</script>
