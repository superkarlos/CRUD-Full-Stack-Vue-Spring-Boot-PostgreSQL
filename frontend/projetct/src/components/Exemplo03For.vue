<script setup>
 let lista = ['carlos', 'jose','luiz']
</script>

<template>
    <ul>
        <li v-for="nome in lista">
            
            {{ nome }}
        </li>
    </ul>
</template>