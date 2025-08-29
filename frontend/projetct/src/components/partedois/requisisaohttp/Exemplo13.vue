<!-- SCRIPT -->
<script setup>

    // Importar REF
    import { onMounted, ref } from 'vue';

    // Vetor dinâmico
    let vetor = ref([]);

    // Requisição
    onMounted(() => {
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then(requisicao => requisicao.json())
        .then(postagens => vetor = postagens);
    });

</script>

<!-- HTML -->
<template>
    <h1>Requisiçõe</h1>

   
    {{ vetor }}
</template>