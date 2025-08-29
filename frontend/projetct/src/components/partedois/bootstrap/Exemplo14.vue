<script setup>
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min.js";
</script>

<template>
  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-black fixed-top shadow">
    <div class="container">
      <a class="navbar-brand fw-bold text-warning fs-3" href="#">🏋️ FitLife</a>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarNav"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ms-auto fw-bold">
          <li class="nav-item"><a class="nav-link text-warning" href="#hero">Início</a></li>
          <li class="nav-item"><a class="nav-link text-warning" href="#sobre">Sobre</a></li>
          <li class="nav-item"><a class="nav-link text-warning" href="#planos">Planos</a></li>
          <li class="nav-item"><a class="nav-link text-warning" href="#galeria">Galeria</a></li>
          <li class="nav-item"><a class="nav-link text-warning" href="#depoimentos">Depoimentos</a></li>
          <li class="nav-item"><a class="nav-link text-warning" href="#contato">Contato</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Hero / Banner -->
  <section
    id="hero"
    class="text-light text-center d-flex align-items-center"
    style="background: url('https://images.pexels.com/photos/1552242/pexels-photo-1552242.jpeg?auto=compress&cs=tinysrgb&w=1600') center/cover no-repeat; height: 100vh;"
  >
    <div class="container">
      <h1 class="display-2 fw-bold text-warning">TRANSFORME SUA VIDA</h1>
      <p class="lead mb-4 fs-4">
        Treinos de alta performance, professores qualificados e ambiente motivador.
      </p>
      <button
        class="btn btn-warning btn-lg fw-bold"
        data-bs-toggle="modal"
        data-bs-target="#cadastroModal"
      >
        INSCREVA-SE AGORA
      </button>
    </div>
  </section>

  <!-- Sobre -->
  <section id="sobre" class="py-5 bg-light">
    <div class="container text-center">
      <h2 class="fw-bold mb-4">💡 Quem Somos</h2>
      <p class="fs-5">
        A <span class="text-warning fw-bold">FitLife</span> é a academia ideal para quem busca
        saúde, bem-estar e performance. Oferecemos treinos personalizados,
        acompanhamento profissional e a melhor infraestrutura da cidade.
      </p>
    </div>
  </section>

  <!-- Galeria -->
  <section id="galeria" class="py-5 bg-black">
    <div class="container text-center">
      <h2 class="fw-bold text-warning mb-4">🏋️ Estrutura & Treinos</h2>
      <div class="row g-3">
        <div class="col-md-4">
          <img src="https://images.pexels.com/photos/2261485/pexels-photo-2261485.jpeg?auto=compress&cs=tinysrgb&w=800" class="img-fluid rounded shadow" />
        </div>
        <div class="col-md-4">
          <img src="https://images.pexels.com/photos/414029/pexels-photo-414029.jpeg?auto=compress&cs=tinysrgb&w=800" class="img-fluid rounded shadow" />
        </div>
        <div class="col-md-4">
          <img src="https://images.pexels.com/photos/1552106/pexels-photo-1552106.jpeg?auto=compress&cs=tinysrgb&w=800" class="img-fluid rounded shadow" />
        </div>
      </div>
    </div>
  </section>

  <!-- Planos -->
  <section id="planos" class="py-5 bg-light">
    <div class="container text-center">
      <h2 class="fw-bold mb-5">💳 Nossos Planos</h2>
      <div class="row">
        <div class="col-md-4 mb-4">
          <div class="card border-0 shadow h-100">
            <div class="card-body">
              <h5 class="card-title fw-bold">Plano Básico</h5>
              <p class="card-text">Acesso livre em horário comercial.</p>
              <h3 class="text-warning">R$ 79/mês</h3>
              <button class="btn btn-outline-warning fw-bold">Assinar</button>
            </div>
          </div>
        </div>

        <div class="col-md-4 mb-4">
          <div class="card border-0 shadow h-100">
            <div class="card-body">
              <h5 class="card-title fw-bold">Plano Premium</h5>
              <p class="card-text">
                Academia + Aulas coletivas + Personal 1x por semana.
              </p>
              <h3 class="text-warning">R$ 149/mês</h3>
              <button class="btn btn-outline-warning fw-bold">Assinar</button>
            </div>
          </div>
        </div>

        <div class="col-md-4 mb-4">
          <div class="card border-0 shadow h-100">
            <div class="card-body">
              <h5 class="card-title fw-bold">Plano VIP</h5>
              <p class="card-text">Todos os benefícios + personal exclusivo.</p>
              <h3 class="text-warning">R$ 249/mês</h3>
              <button class="btn btn-outline-warning fw-bold">Assinar</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Depoimentos -->
  <section id="depoimentos" class="py-5 bg-black text-light">
    <div class="container text-center">
      <h2 class="fw-bold text-warning mb-5">💬 O que nossos alunos dizem</h2>
      <div class="row g-4">
        <div class="col-md-4">
          <div class="p-4 bg-dark rounded shadow">
            <p>"A melhor academia que já treinei, os professores são incríveis!"</p>
            <h6 class="fw-bold text-warning">- João Silva</h6>
          </div>
        </div>
        <div class="col-md-4">
          <div class="p-4 bg-dark rounded shadow">
            <p>"Ambiente motivador, equipamentos modernos e ótimos planos."</p>
            <h6 class="fw-bold text-warning">- Maria Oliveira</h6>
          </div>
        </div>
        <div class="col-md-4">
          <div class="p-4 bg-dark rounded shadow">
            <p>"Graças à FitLife consegui alcançar meu objetivo de perder peso."</p>
            <h6 class="fw-bold text-warning">- Pedro Santos</h6>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Contato -->
  <section id="contato" class="py-5 bg-light">
    <div class="container">
      <h2 class="fw-bold text-center mb-4">📞 Fale Conosco</h2>
      <div class="row justify-content-center">
        <div class="col-md-6">
          <form>
            <div class="mb-3">
              <label class="form-label">Nome</label>
              <input type="text" class="form-control" placeholder="Seu nome" />
            </div>
            <div class="mb-3">
              <label class="form-label">Email</label>
              <input type="email" class="form-control" placeholder="seuemail@email.com" />
            </div>
            <div class="mb-3">
              <label class="form-label">Mensagem</label>
              <textarea class="form-control" rows="4" placeholder="Digite sua mensagem..."></textarea>
            </div>
            <button type="submit" class="btn btn-warning w-100 fw-bold">Enviar</button>
          </form>
        </div>
      </div>
    </div>
  </section>

  <!-- Modal de Cadastro -->
  <div
    class="modal fade"
    id="cadastroModal"
    tabindex="-1"
    aria-labelledby="cadastroModalLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog">
      <div class="modal-content border-warning">
        <div class="modal-header bg-warning">
          <h1 class="modal-title fs-5 text-dark fw-bold" id="cadastroModalLabel">
            Cadastro de Aluno
          </h1>
          <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
        </div>
        <div class="modal-body">
          <form>
            <div class="mb-3">
              <label class="form-label">Nome</label>
              <input type="text" class="form-control" placeholder="Seu nome" />
            </div>
            <div class="mb-3">
              <label class="form-label">Email</label>
              <input type="email" class="form-control" placeholder="seuemail@email.com" />
            </div>
            <div class="mb-3">
              <label class="form-label">Telefone</label>
              <input type="text" class="form-control" placeholder="(xx) xxxxx-xxxx" />
            </div>
            <button type="submit" class="btn btn-warning w-100 fw-bold">Finalizar Inscrição</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <!-- Footer -->
  <footer class="bg-black text-warning py-4 mt-5">
    <div class="container text-center">
      <p class="mb-0 fw-bold">© 2025 FitLife - Todos os direitos reservados.</p>
      <small>Siga-nos no Instagram: @fitlife_academia</small>
    </div>
  </footer>
</template>
