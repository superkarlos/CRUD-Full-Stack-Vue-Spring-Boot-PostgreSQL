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
</template>

<script setup>
import { ref } from "vue";

const nome = ref("");
const idade = ref("");
const erros = ref({});

async function enviarFormulario() {
  erros.value = {};
  try {
    const resposta = await fetch("http://localhost:8080/api/pessoas/cadastrar", {
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
  } catch (erro) {
    alert("❌ Falha ao enviar: " + erro.message);
  }
}
</script>

<style scoped>
.formulario {
  max-width: 450px;
  margin: 2rem auto;
  padding: 2rem;
  background: linear-gradient(145deg, #ffffff, #f8f8f8);
  border-radius: 1.5rem;
  box-shadow: 0 10px 20px rgba(0,0,0,0.08);
  display: flex;
  flex-direction: column;
}

h2 {
  text-align: center;
  font-size: 1.8rem;
  color: #333;
  margin-bottom: 1.5rem;
}

.campo {
  display: flex;
  flex-direction: column;
  margin-bottom: 1.2rem;
}

label {
  margin-bottom: 0.5rem;
  font-weight: 600;
  color: #555;
}

input {
  padding: 0.65rem 0.8rem;
  border-radius: 0.75rem;
  border: 1px solid #ccc;
  font-size: 1rem;
  transition: all 0.3s;
}

input:focus {
  border-color: #6c63ff;
  box-shadow: 0 0 8px rgba(108, 99, 255, 0.3);
  outline: none;
}

.erro {
  color: #ff4b5c;
  font-size: 0.85rem;
  margin-top: 0.25rem;
}

button {
  margin-top: 1rem;
  padding: 0.75rem 1rem;
  border: none;
  border-radius: 999px;
  font-weight: 600;
  color: white;
  background: linear-gradient(90deg, #6c63ff, #4b49e1);
  cursor: pointer;
  transition: transform 0.2s, background 0.3s, box-shadow 0.3s;
  box-shadow: 0 5px 15px rgba(108, 99, 255, 0.3);
}

button:hover {
  transform: scale(1.05);
  background: linear-gradient(90deg, #4b49e1, #6c63ff);
  box-shadow: 0 8px 20px rgba(108, 99, 255, 0.4);
}
</style>
