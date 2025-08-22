<script setup>
import { ref } from 'vue';

 let texto = ref('')
</script>

<template>
    <section>
        <h1>
            Formulario
        </h1>
        <label for="">nome</label>
        <input type="text" v-model="texto">
        <p>{{ texto }}</p>
    </section>
</template>

<style>
 section{
    width: 300px; height: 300px;
    background: #d4cdcd;
    padding: 30px;
 }
</style>