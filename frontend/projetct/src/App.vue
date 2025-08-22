<script setup>
import Exemplo01 from './components/Exemplo01.vue'
import { ref } from 'vue'

const nomeUsuario = ref('nome')
</script>

<template>
  <div class="app-container">
    <Exemplo01 :nome="nomeUsuario" v-if="nomeUsuario !=  'carlos'">
      <p class="subtitle">Este conteúdo veio do componente pai!</p>
    </Exemplo01>

    <input 
      v-model="nomeUsuario" 
      placeholder="Digite outro nome" 
      class="input-nome"
    />
  </div>
</template>

<style scoped>
.app-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: flex-start;
  min-height: 100vh;
  padding: 2rem;
  background: linear-gradient(to bottom right, #ffefef, #ffe0e0);
  font-family: 'Segoe UI', Tahoma, sans-serif;
}

.input-nome {
  margin-top: 1.5rem;
  padding: 0.75rem 1rem;
  border: 2px solid #b30000;
  border-radius: 12px;
  font-size: 1rem;
  outline: none;
  transition: border-color 0.2s, box-shadow 0.2s;
}

.input-nome:focus {
  border-color: #ff4d4d;
  box-shadow: 0 0 8px rgba(255, 77, 77, 0.4);
}

.subtitle {
  color: #555555;
  font-size: 1rem;
  margin-top: 0.5rem;
}
</style>
