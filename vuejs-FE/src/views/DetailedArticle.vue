<script setup>
import Navbar from "@/components/Navbars/IndexNavbar.vue";
import FooterComponent from "@/components/Footers/Footer.vue";
import { ref } from "vue";

// Bài viết chi tiết (thường lấy từ API)
const post = ref({
  title: "Những câu nói hay của sư Minh Niệm - chữa lành 23",
  image: "https://images.unsplash.com/photo-1548199973-03cce0bbc87b?auto=format&fit=crop&w=1200&q=80",
  content: `
    <h3>1) KẾT NỐI VỚI NHỮNG NGƯỜI THÂN YÊU</h3>
    <p>Khi mà mình có bình an, có hạnh phúc, <strong>có nhiều chất lượng trong đời sống rồi</strong>, thì tự động – một cách vô hình – sẽ thiết lập một sợi dây kết nối với những người thân yêu của mình.</p>
    <p>Thường khi ở gần bên nhau thì hay kiểm chuyện để không nhìn vào mặt nhau.</p>
    <p>Rồi khi xa nhau, thì người ta mới nhớ về nhau...</p>
  `
})

// Bài viết cùng chủ đề
const relatedPosts = ref([
  { title: "Những câu nói hay của sư Minh Niệm - chữa lành 24", link: "#" },
  { title: "Những câu nói hay của sư Minh Niệm - chữa lành 22", link: "#" },
  { title: "Những câu nói hay của sư Minh Niệm - chữa lành 21", link: "#" },
  { title: "Những câu nói hay của sư Minh Niệm - chữa lành 20", link: "#" }
])
</script>

<template>
  <div class="flex flex-col min-h-screen">
    <Navbar />

    <!-- Banner đầu trang với ảnh nền -->
    <section class="relative h-64 flex items-center justify-center bg-center bg-cover"
      :style="{ backgroundImage: `url('${post.image}')` }">
      <div class="absolute inset-0 bg-black bg-opacity-60"></div>
      <div class="relative text-white text-center px-4">
        <h1 class="text-3xl md:text-4xl font-bold">{{ post.title }}</h1>
        <div class="mt-2 text-sm">
          <router-link to="/" class="hover:underline">Trang chủ</router-link>
          <span class="mx-1">›</span>
          <router-link to="/bai-viet" class="hover:underline">Bài viết</router-link>
        </div>
      </div>
    </section>

    <!-- Nội dung -->
    <main class="flex-grow pt-10 pb-16">
      <div class="max-w-7xl mx-auto px-4">
        <div class="grid lg:grid-cols-3 gap-8">
          <!-- Bên trái: nội dung bài viết -->
          <div class="lg:col-span-2 space-y-6">
            <div class="prose prose-lg max-w-none" v-html="post.content"></div>
          </div>

          <!-- Bên phải: bài viết liên quan -->
          <aside class="space-y-6">
            <h2 class="text-lg font-bold border-b pb-2">Các bài viết cùng chủ đề</h2>
            <ul class="space-y-3">
              <li v-for="item in relatedPosts" :key="item.title">
                <router-link :to="item.link" class="text-blue-600 hover:underline text-base">
                  {{ item.title }}
                </router-link>
              </li>
            </ul>
          </aside>
        </div>
      </div>
    </main>

    <FooterComponent />
  </div>
</template>

<style scoped>
.prose strong {
  color: #1a202c;
}
</style>
