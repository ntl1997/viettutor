<template>
  <div class="bg-white border rounded overflow-hidden hover:shadow transition">
    <a :href="post.link" class="block">
      <div class="w-full h-[230px] overflow-hidden">
        <img :src="post.image" alt="" class="w-full h-full object-cover" />
      </div>

      <div class="p-4">
        <h3 class="text-base font-bold text-gray-900 uppercase leading-snug">
          {{ post.title }}
        </h3>
        <a :href="post.link" class="text-green-600 text-sm font-medium mt-2 inline-block hover:underline">
          Xem chi tiết
        </a>
      </div>
    </a>
  </div>
</template>

<script setup>
defineProps({
  post: Object
});
</script>
