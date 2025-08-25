<script setup>
  import { onMounted, ref } from 'vue';
 let texto = ref('Seja bem vindo')

 //lifecycle
 onMounted(()=>{
    setTimeout(()=>{
        texto.value="novo texto";
    },1000)
 })
</script>

<template>
  
    <h1>
        {{ texto }}
    </h1>
</template>