<script setup>
import { ref } from 'vue';

let vetor = ref([]);

 onMounted(() => {
        fetch('http://localhost:3000/produtos')
        .then(requisicao => requisicao.json())
        .then(postagens => vetor = postagens);
    });
 </script>
  

<template>


{{ vetor }}
</template>