<script setup>
import Navbar from "@/components/Navbars/IndexNavbar.vue";
import FooterComponent from "@/components/Footers/Footer.vue";
import CardPostList from "@/components/Cards/CardPostList.vue";
import SidebarLinks from "@/components/Sidebar/SidebarLinks.vue";

const posts = [
  {
    title: "Những câu nói hay của Sư Minh Niệm - Chữa lành 24",
    excerpt: "Chia sẻ từ buổi giảng số 24",
    image: "https://images.unsplash.com/photo-1605721911519-3dfeb3be25e7?auto=format&fit=crop&w=870&q=80",
    link: "#"
  },
  {
    title: "Những câu nói hay của Sư Minh Niệm - Chữa lành 23",
    excerpt: "Chia sẻ từ buổi giảng số 23",
    image: "https://images.unsplash.com/photo-1548199973-03cce0bbc87b?auto=format&fit=crop&w=870&q=80",
    link: "#"
  }
];
</script>

<template>
  <div class="flex flex-col min-h-screen">
    <Navbar />

    <main class="flex-grow pt-16 md:pt-20">
      <div class="max-w-7xl mx-auto px-4 py-8">
        <div class="grid lg:grid-cols-3 gap-8">
          <!-- Cột trái: danh sách bài viết -->
          <div class="lg:col-span-2 space-y-6">
            <CardPostList :posts="posts" />
          </div>

          <!-- Cột phải: Sidebar -->
          <div class="space-y-10">
            <SidebarLinks />
          </div>
        </div>
      </div>
    </main>

    <FooterComponent />
  </div>
</template>
