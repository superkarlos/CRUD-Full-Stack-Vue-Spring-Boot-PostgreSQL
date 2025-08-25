<script setup>
   const props = defineProps([
    'nome','idade','cidade', 'vetor','fuc'
   ])
</script>
<template>
    <h1>{{ nome }}</h1>
    <h1>{{ idade }}</h1>
    <h1>{{ cidade }}</h1>

    <section>
        <ul>
            <li v-for="x in vetor"> {{ x }}</li>
        </ul>
    </section>
    <button @click="fuc">Click</button>
</template>