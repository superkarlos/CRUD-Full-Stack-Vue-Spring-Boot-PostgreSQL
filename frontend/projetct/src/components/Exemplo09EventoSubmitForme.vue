<script setup>
import { ref, onMounted } from "vue";

const nome = ref("");
const idade = ref("");
const erros = ref({});
const pessoas = ref([]);

// GET: carregar pessoas
async function carregarPessoas() {
  try {
    const resposta = await fetch("http://localhost:8080/api/pessoas");
    if (!resposta.ok) throw new Error("Erro ao carregar lista");
    pessoas.value = await resposta.json();
  } catch (erro) {
    alert("❌ Falha ao carregar pessoas: " + erro.message);
  }
}

// POST: salvar nova pessoa
async function enviarFormulario() {
  erros.value = {};
  try {
    const resposta = await fetch("http://localhost:8080/api/pessoas", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ nome: nome.value, idade: idade.value })
    });

    if (!resposta.ok) {
      const dados = await resposta.json();
      erros.value = dados;
      return;
    }

    const data = await resposta.json();
    alert(`✅ Salvo: ${data.nome}, Idade: ${data.idade}`);
    nome.value = "";
    idade.value = "";
    await carregarPessoas();
  } catch (erro) {
    alert("❌ Falha ao enviar: " + erro.message);
  }
}

// DELETE: remover pessoa
async function deletarPessoa(id) {
  if (!confirm("Deseja realmente remover esta pessoa?")) return;
  try {
    const resposta = await fetch(`http://localhost:8080/api/pessoas/${id}`, { method: "DELETE" });
    if (!resposta.ok) throw new Error("Erro ao deletar pessoa");
    await carregarPessoas();
  } catch (erro) {
    alert("❌ Falha ao deletar: " + erro.message);
  }
}

onMounted(() => carregarPessoas());
</script>

<template>

    <form class="formulario" @submit.prevent="enviarFormulario">
      <h2>Cadastro de Pessoa</h2>
      <div class="campo">
        <label for="nome">Nome</label>
        <input id="nome" v-model="nome" placeholder="Digite seu nome" />
        <span class="erro" v-if="erros.nome">{{ erros.nome }}</span>
      </div>
      <div class="campo">
        <label for="idade">Idade</label>
        <input id="idade" type="number" v-model="idade" placeholder="Digite sua idade" />
        <span class="erro" v-if="erros.idade">{{ erros.idade }}</span>
      </div>
      <button type="submit">Salvar</button>
    </form>

    <section class="lista">
      <h2>Pessoas Cadastradas</h2>
      <div class="cards">
        <div class="card" v-for="p in pessoas" :key="p.id">
          <h3>{{ p.nome }}</h3>
          <p>Idade: {{ p.idade }} anos</p>
          <div class="acoes">
            <!-- futuramente pode adicionar editar -->
            <button class="delete" @click="deletarPessoa(p.id)">Remover</button>
          </div>
        </div>
      </div>
    </section>

</template>

<style scoped>
/* Container */
.container {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 40px 20px;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  background: linear-gradient(135deg, #f0f2f5, #e0e0e0);
  min-height: 100vh;
}

/* Formulário */
.formulario {
  background: #ffffff;
  padding: 35px 30px;
  border-radius: 20px;
  box-shadow: 0 12px 30px rgba(0,0,0,0.15);
  width: 100%;
  max-width: 450px;
  margin-bottom: 50px;
  transition: transform 0.3s ease;
}

.formulario:hover {
  transform: translateY(-3px);
}

.formulario h2 {
  text-align: center;
  margin-bottom: 25px;
  color: #4caf50;
}

.campo {
  display: flex;
  flex-direction: column;
  margin-bottom: 20px;
}

label {
  font-weight: 600;
  margin-bottom: 6px;
  color: #555;
}

input {
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 10px;
  font-size: 14px;
  transition: all 0.3s ease;
}

input:focus {
  outline: none;
  border-color: #4caf50;
  box-shadow: 0 0 8px rgba(76,175,80,0.3);
}

.erro {
  color: #e53935;
  font-size: 13px;
  margin-top: 4px;
}

/* Botão */
button {
  width: 100%;
  padding: 14px;
  border: none;
  border-radius: 10px;
  background: #4caf50;
  color: #fff;
  font-size: 16px;
  font-weight: 600;
  cursor: pointer;
  transition: 0.3s;
}

button:hover {
  background: #43a047;
}

/* Lista de pessoas */
.lista {
  width: 100%;
  max-width: 900px;
}

.lista h2 {
  text-align: center;
  margin-bottom: 25px;
  color: #333;
}

/* Cards */
.cards {
  display: flex;
  flex-wrap: wrap;
  gap: 20px;
  justify-content: center;
}

.card {
  background: #ffffff;
  padding: 20px 15px;
  border-radius: 15px;
  box-shadow: 0 6px 25px rgba(0,0,0,0.1);
  width: 200px;
  text-align: center;
  transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.card:hover {
  transform: translateY(-5px);
  box-shadow: 0 12px 30px rgba(0,0,0,0.15);
}

.card h3 {
  margin-bottom: 10px;
  color: #4caf50;
}

.card p {
  font-size: 14px;
  color: #555;
}

/* Botão dentro do card */
.acoes {
  margin-top: 15px;
}

.acoes .delete {
  padding: 8px 12px;
  border: none;
  border-radius: 8px;
  background: #e53935;
  color: #fff;
  font-size: 13px;
  cursor: pointer;
  transition: 0.3s;
}

.acoes .delete:hover {
  background: #d32f2f;
}

/* Responsividade */
@media (max-width: 600px) {
  .formulario {
    padding: 25px 20px;
    border-radius: 15px;
  }

  .card {
    width: 150px;
  }
}
</style>
