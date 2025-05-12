<script setup>

import CardPost from './CardPost.vue';

defineProps({
  posts: Array
});
</script>

<template>
  <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
    <CardPost v-for="(post, index) in posts" :key="index" :post="post" />
  </div>
</template>
