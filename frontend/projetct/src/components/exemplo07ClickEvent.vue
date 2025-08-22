<script setup>
import { ref } from 'vue'

const nomes = ref('')

function msmg() {
  alert("Chamou a função com o nome: " + nomes.value)
}
</script>

<template>
  <section>
    <input 
      type="text" 
      v-model="nomes" 
      placeholder="Digite seu nome"
      class="border rounded p-2"
    >
    
    <button 
      @click="msmg" 
      class="ml-2 bg-blue-500 text-white px-4 py-2 rounded"
    >
      Click
    </button>

    <p class="mt-4">Nome digitado: <strong>{{ nomes }}</strong></p>
  </section>
</template>
