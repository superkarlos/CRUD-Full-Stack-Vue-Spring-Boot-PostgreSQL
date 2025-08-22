<script setup>
import { defineProps } from 'vue'

const props = defineProps({
  nome: {
    type: String,
    required: true,
    default: 'Alice'
  }
})
</script>

<template>
  <section class="card">
    <h1 class="title">Nome: {{ props.nome }}</h1>

  </section>
</template>

<style scoped>
.card {
  padding: 1.5rem 2rem;
  background: #ffffff;
  border-radius: 16px;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
  max-width: 400px;
  margin: 1rem auto;
  text-align: center;
  transition: transform 0.2s;
}

.card:hover {
  transform: translateY(-5px);
}

.title {
  color: #333333;
  font-family: 'Segoe UI', Tahoma, sans-serif;
  font-size: 1.5rem;
  margin-bottom: 1rem;
}
</style>
