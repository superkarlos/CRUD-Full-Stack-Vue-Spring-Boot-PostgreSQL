<template>
  <main class="error-page" role="main" aria-labelledby="error-title">
    <section class="error-card">
      <div class="illustration" aria-hidden="true">
        <!-- Ícone de alerta -->
        <svg viewBox="0 0 24 24" width="88" height="88" class="icon">
          <path d="M1 21h22L12 2 1 21z" fill="currentColor" opacity="0.08"/>
          <path d="M12 8v6m0 3h.01" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
        </svg>
      </div>

      <h1 id="error-title" class="title">Algo deu errado</h1>
      <p class="message">Ocorreu um erro inesperado. Por favor, tente novamente.</p>

      <nav class="actions">
        <a class="btn" href="/">Voltar ao início</a>
      </nav>
    </section>
  </main>
</template>

<style scoped>
.error-page {
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

.error-card {
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

.illustration { display: grid; place-items: center; margin-bottom: 14px; }
.icon { color: #a5b4fc; }

.title { font-size: 1.5rem; line-height: 1.25; margin: 4px 0 8px; font-weight: 700; color: #f8fafc; }
.message { font-size: .9875rem; color: #cbd5e1; margin: 0 0 18px; }

.actions { display: flex; justify-content: center; gap: 12px; }
.btn {
  display: inline-flex; align-items: center; justify-content: center;
  padding: 10px 14px; border-radius: 12px; text-decoration: none;
  border: 1px solid rgba(148,163,184,.25);
  background: rgba(30, 41, 59, 0.6);
  color: #e5e7eb; font-weight: 600; transition: transform .12s ease, box-shadow .12s ease, background .12s ease;
}
.btn:hover { transform: translateY(-1px); box-shadow: 0 8px 18px rgba(0,0,0,.25); }

@media (prefers-color-scheme: light) {
  .error-page { background: linear-gradient(180deg, #f8fafc, #e2e8f0); color: #0f172a; }
  .error-card { background: #ffffffd9; border-color: rgba(15,23,42,.08); }
  .icon { color: #6366f1; }
  .title { color: #0f172a; }
  .message { color: #334155; }
}
</style>
