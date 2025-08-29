<script setup>
import { onMounted, ref } from "vue";

const produtos = ref([]);
let bntcad = ref([true])

onMounted(() => {
  fetch("http://localhost:3000/produtos")
    .then((req) => req.json())
    .then((ret) => (produtos.value = ret));
});

let obj = ref({
    'id':0,'produto':'','valor':0
})


function cadastrar(event) {
  event.preventDefault();

  const novoProduto = {
    produto: obj.value.produto,
    valor: obj.value.valor
  };
  bntcad.value= false;
  fetch("http://localhost:3000/produtos", {
    method: "POST",
    body: JSON.stringify(novoProduto),
    headers: { "Content-Type": "application/json" }
  })
    .then(res => res.json())
    .then(data => {
      produtos.value.push(data);
      obj.value = { id: 0, produto: "", valor: 0 };
    });
}

function dell(event){
    // alert('tese');
    // event.preventDefault();
    fetch('http://localhost:3000/produtos'
        ,{method:'DELET',
        body:JSON.stringify(obj.value),
        headers: {'Contents-Type':'apllycation/json'}
        }
    )
    .then(
        requisicao => requisicao.json()
    )
    

}

function selecionar(indice){
  obj.value = {
    id :produtos.value[indice].id,
    produto : produtos.value[indice].produto,
     valor : produtos.value[indice].valor,
  }
  bntcad.value= false;
}

</script>
<style>
form {
  padding: 20px;
  background: #f8f9fa; /* cor mais clean */
  border-radius: 10px;
  box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
  border: 1px solid red;
}
.esp{
    margin: 0 5px 0 5px;
}
</style>
<template>
  <form action="" class="container mt-4" @submit="cadastrar">
     <input  type="hidden"  v-model="obj.id" />
    <div class="mb-3">
      <label for="produto" class="form-label" >Produto</label>
      <input  type="text" class="form-control" id="produto" placeholder="Digite o nome do produto" v-model="obj.produto" />
    </div>

    <div class="mb-3">
      <label for="valor" class="form-label">Valor</label>
      <input  type="number"  class="form-control" id="valor" placeholder="Digite o valor"  v-model="obj.valor" />
    </div>

    <button type="submit"  v-if="bntcad" class="btn btn-primary esp" >Cadastrar</button><button type="submit" class="btn btn-primary esp" v-if="!bntcad">Editar</button><button type="submit" class="btn btn-danger  esp" v-if="!bntcad">Deletar</button>
  </form>
  <div class="container mt-4">
    <h1 class="mb-4">Tabela de Produtos</h1>

    <table class="table table-striped table-bordered">
      <thead class="table-dark">
        <tr>
          <th>Produto</th>
          <th>Valor</th>
          <th>Ação</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(obj,indice) in produtos" :key="obj.id">
          <td>{{ obj.produto }}</td>
          <td>{{ obj.valor }}</td>
          <td>
            <button class="btn btn-primary" @click="selecionar(indice)">Selecionar</button>
            
          </td>
        </tr>
      </tbody>
    </table>

    <!-- Debug: mostrar os selecionados -->
    <div class="alert alert-info mt-3">Selecionados: {{ selecionados }}</div>
  </div>
</template>
