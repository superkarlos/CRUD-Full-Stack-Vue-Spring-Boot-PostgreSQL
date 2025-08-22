<script setup>

  let nome = "carlos";
  let html = "<h1 style='color: red;'>VERMELHO</h1>"
</script>

<template>
    <section>
        {{ nome }}
    </section>
    <h1 v-html="html"></h1>
</template>