<script setup>
   function alerta(){
    alert("clicou no botão")
   }
</script>

<template>
    <section>
        <h1>Digite seu nome e enter</h1>
        <input type="text" @keyup.p="alerta">
    </section>
</template>