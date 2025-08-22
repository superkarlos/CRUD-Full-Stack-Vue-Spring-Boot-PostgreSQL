<script setup>
let validação = false;

</script>

<template>
    <p>Sera que deu certo ?</p>

    <h1 :class ="validação? 'ok' : 'error'"> ====================</h1>
</template>

<style>
   .ok{
    color: greenyellow;
   }
   .error{
    color:red;
   }
</style>