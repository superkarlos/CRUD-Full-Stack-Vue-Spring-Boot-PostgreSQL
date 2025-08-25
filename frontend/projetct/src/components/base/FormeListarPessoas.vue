<template>
  <section class="container">
    <h2>Pessoas Cadastradas</h2>

    <div class="cards">
      <div v-for="p in pessoas" :key="p.id" class="card">
        <div class="info">
          <h3>{{ p.nome }}</h3>
          <p>Idade: {{ p.idade }} anos</p>
        </div>
        <button class="btn" @click="deletarPessoa(p.id)">Remover</button>
      </div>
    </div>
  </section>
</template>

<script setup>
import { ref, onMounted } from "vue";

const pessoas = ref([]);

async function carregarPessoas() {
  try {
    const resposta = await fetch("http://localhost:8080/api/pessoas/listar");
    if (!resposta.ok) throw new Error("Erro ao carregar lista");
    pessoas.value = await resposta.json();
  } catch (erro) {
    alert("❌ Falha ao carregar pessoas: " + erro.message);
  }
}

function deletarPessoa(id) {
  alert(`Remover pessoa com ID: ${id} (em breve implementado)`);
}

onMounted(() => carregarPessoas());
</script>

<style scoped>
.container {
  max-width: 1000px;
  margin: 2rem auto;
  padding: 0 1rem;
  text-align: center;
}

h2 {
  font-size: 2rem;
  font-weight: bold;
  color: #333;
  margin-bottom: 2rem;
}

.cards {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
  gap: 1.5rem;
}

.card {
  background: linear-gradient(145deg, #ffffff, #f5f5f5);
  border-radius: 1rem;
  padding: 1.5rem;
  box-shadow: 0 10px 20px rgba(0,0,0,0.08);
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  transition: transform 0.3s, box-shadow 0.3s;
}

.card:hover {
  transform: translateY(-5px);
  box-shadow: 0 15px 25px rgba(0,0,0,0.15);
}

.info h3 {
  font-size: 1.25rem;
  color: #222;
  margin-bottom: 0.5rem;
}

.info p {
  color: #555;
  font-size: 0.95rem;
}

.btn {
  background: linear-gradient(90deg, #ff4b5c, #ff1f3d);
  color: white;
  border: none;
  padding: 0.75rem 1rem;
  border-radius: 999px;
  font-weight: 600;
  cursor: pointer;
  transition: transform 0.2s, background 0.3s;
}

.btn:hover {
  transform: scale(1.05);
  background: linear-gradient(90deg, #ff1f3d, #ff4b5c);
}
</style>
