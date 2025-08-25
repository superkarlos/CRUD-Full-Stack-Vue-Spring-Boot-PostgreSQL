import { createRouter, createWebHistory } from "vue-router";
import FormeEnviarPessoas from "../components/base/FormeEnviarPessoas.vue";
import FormeListarPessoas from "../components/base/FormeListarPessoas.vue";

const routes = [
  { path: "/", redirect: "/listar" }, // redireciona para lista
  { path: "/cadastrar", component: FormeEnviarPessoas },
  { path: "/listar", component: FormeListarPessoas },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
