#  CRUD Pessoa - Vue + Spring Boot + PostgreSQL

Aplicação **CRUD** básica para gerenciamento de pessoas, desenvolvida em **Java (Spring Boot)** no back-end, **Vue.js** no front-end e **PostgreSQL** como banco de dados.  
O projeto roda em **containers Docker**, com **Nginx** servindo o front-end e o back-end em outro container separado.

---

##  Tecnologias Utilizadas
-  [Spring Boot](https://spring.io/projects/spring-boot) (Java)
-  [Vue.js](https://vuejs.org/)
-  [PostgreSQL](https://www.postgresql.org/)
-  [Docker](https://www.docker.com/)
-  [Nginx](https://www.nginx.com/)

---

##  Funcionalidades
-  Cadastrar pessoa  
-  Listar pessoas  
-  Editar pessoa  
-  Excluir pessoa  

---

##  Como Rodar o Projeto com Docker

### 1 Clonar o repositório
``` 
git clone https://github.com/seu-usuario/CRUD-VUE-SPRINGBOOT_JAVA-POSTGRES.git
cd CRUD-VUE-SPRINGBOOT_JAVA-POSTGREES 
````
### 2 Configurar variáveis de ambiente

  Crie um arquivo .env na raiz do projeto com o conteúdo:
  POSTGRES_USER=seuusuario
  POSTGRES_PASSWORD=suasenha
  POSTGRES_DB=pessoa_db

### 3 Subir os containers
docker-compose up --build


O frontend ficará disponível em http://localhost
O backend em http://localhost:8080
O Postgres em localhost:5432

 ### Estrutura do Projeto
```
CRUD-VUE-SPRINGBOOT_JAVA-POSTGRES/
├── backend/        # Projeto Spring Boot (API REST)
├── frontend/       # Projeto Vue.js (interface do usuário)
├── nginx/          # Configuração do Nginx
├── docker-compose.yml
└── README.md
```
## Endpoints da API Pessoa
Método	Endpoint	Descrição
```
GET	/pessoas	Lista todas as pessoas
GET	/pessoas/{id}	Busca pessoa por ID
POST	/pessoas	Cria uma nova pessoa
PUT	/pessoas/{id}	Atualiza uma pessoa
DELETE	/pessoas/{id}	Remove uma pessoa
```

