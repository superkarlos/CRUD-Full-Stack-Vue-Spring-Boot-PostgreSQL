<template>
  <main class="page" role="main">
    <section class="page-card">
      <h1 class="title">Página 1</h1>
      <p class="subtitle">Bem-vindo(a) à sua primeira página estilizada 🎉</p>

      <nav class="actions">
        <a class="btn" href="/">Início</a>
        <a class="btn primary" href="#/pagina2">Ir para Página 2</a>
      </nav>
    </section>
  </main>
</template>

<style scoped>
.page {
  min-height: 100dvh;
  display: grid;
  place-items: center;
  padding: 24px;
  background:
    radial-gradient(1000px 500px at -10% -20%, rgba(99,102,241,.08), transparent 60%),
    radial-gradient(800px 400px at 120% 0%, rgba(16,185,129,.08), transparent 60%),
    linear-gradient(180deg, #0b1020 0%, #0f172a 100%);
  color: #e5e7eb;
}

.page-card {
  width: 100%;
  max-width: 560px;
  background: rgba(15, 23, 42, 0.6);
  backdrop-filter: blur(8px);
  border: 1px solid rgba(148, 163, 184, 0.15);
  border-radius: 20px;
  padding: 28px;
  text-align: center;
  box-shadow: 0 10px 30px rgba(0,0,0,.25);
}

.title { font-size: 1.75rem; font-weight: 700; color: #f8fafc; margin-bottom: 8px; }
.subtitle { font-size: 1rem; color: #cbd5e1; margin-bottom: 18px; }

.actions { display: flex; justify-content: center; gap: 12px; }
.btn {
  display: inline-flex; align-items: center; justify-content: center;
  padding: 10px 14px; border-radius: 12px; text-decoration: none;
  border: 1px solid rgba(148,163,184,.25);
  background: rgba(30, 41, 59, 0.6);
  color: #e5e7eb; font-weight: 600; transition: transform .12s ease, box-shadow .12s ease, background .12s ease;
}
.btn:hover { transform: translateY(-1px); box-shadow: 0 8px 18px rgba(0,0,0,.25); }
.btn.primary { background: #4f46e5; border-color: #4f46e5; color: #fff; }
.btn.primary:hover { background: #4338ca; }

@media (prefers-color-scheme: light) {
  .page { background: linear-gradient(180deg, #f8fafc, #e2e8f0); color: #0f172a; }
  .page-card { background: #ffffffd9; border-color: rgba(15,23,42,.08); }
  .title { color: #0f172a; }
  .subtitle { color: #334155; }
  .btn { background: #f1f5f9; color: #0f172a; }
  .btn.primary { background: #4f46e5; color: #fff; }
}
</style>
