<script setup>
  import Exemplo12Props from './Exemplo12Props.vue';
  //variavel
  let cidade = 'sao paulo';

  let vetor = ['Natal','Rio Janeiro','Mannaus']
  function aletar(){
    alert("oiiiiiiiiiiiiiiiiiiiiiiiiii")
  }
</script>
<template>
    <Exemplo12Props nome="Carlos" idade="22" :cidade="cidade" :vetor="vetor" :fuc="aletar"></Exemplo12Props>
</template>