# 🛒 API de Produtos — Spring Boot

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

> API RESTful para gerenciamento de produtos, desenvolvida com **Spring Boot** e **Spring Data JPA**. Projeto de estudos com operações CRUD completas, testadas via Postman.

---

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Tecnologias](#-tecnologias)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Endpoints da API](#-endpoints-da-api)
- [Como Rodar](#-como-rodar)
- [Testando com Postman](#-testando-com-postman)

---

## 📌 Sobre o Projeto

Este projeto é uma API REST de gerenciamento de produtos desenvolvida como estudo prático de **Spring Boot**. A API permite criar, buscar, atualizar e deletar produtos, utilizando banco de dados relacional via JPA.

---

## 🚀 Tecnologias

| Tecnologia | Função |
|---|---|
| Java 17+ | Linguagem principal |
| Spring Boot | Framework base da aplicação |
| Spring Web | Criação dos endpoints REST |
| Spring Data JPA | Persistência de dados |
| H2 Database | Banco de dados em memória (embutido) |
| Spring Security | Configuração de segurança |
| UUID | Geração de IDs únicos |
| Postman | Testes dos endpoints |

---

## 🗂 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com/github/saopimbapow/apiestudos/
            ├── ApiestudosApplication.java      # Classe principal
            ├── config/
            │   └── SecurityConfiguration.java  # Configurações de segurança
            ├── controller/
            │   └── Produtocontroller.java       # Endpoints REST
            ├── model/
            │   └── produto.java                 # Entidade Produto
            └── Repository/
                └── ProdutoRepository.java       # Interface JPA
```

---

## 📡 Endpoints da API

Base URL: `http://localhost:8080`

### Produto

| Método | Rota | Descrição |
|---|---|---|
| `POST` | `/produtos` | Cadastra um novo produto |
| `GET` | `/produtos/{id}` | Busca produto pelo ID |
| `GET` | `/produtos?nome={nome}` | Busca produto pelo nome |
| `PUT` | `/produtos/{id}` | Atualiza um produto existente |
| `DELETE` | `/produtos/{id}` | Remove um produto |

---

### 📥 POST `/produtos` — Criar produto

**Body (JSON):**
```json
{
  "nome": "Teclado Mecânico",
  "descricao": "Teclado mecânico switch red, RGB",
  "preco": 299.90
}
```

**Resposta (200 OK):**
```json
{
  "id": "a3f9c1d2-...",
  "nome": "Teclado Mecânico",
  "descricao": "Teclado mecânico switch red, RGB",
  "preco": 299.90
}
```

---

### 🔍 GET `/produtos/{id}` — Buscar por ID

**Exemplo:** `GET /produtos/a3f9c1d2-...`

**Resposta (200 OK):**
```json
{
  "id": "a3f9c1d2-...",
  "nome": "Teclado Mecânico",
  "descricao": "Teclado mecânico switch red, RGB",
  "preco": 299.90
}
```

---

### 🔍 GET `/produtos?nome={nome}` — Buscar por nome

**Exemplo:** `GET /produtos?nome=Teclado`

**Resposta (200 OK):**
```json
[
  {
    "id": "a3f9c1d2-...",
    "nome": "Teclado Mecânico",
    "descricao": "Teclado mecânico switch red, RGB",
    "preco": 299.90
  }
]
```

---

### ✏️ PUT `/produtos/{id}` — Atualizar produto

**Body (JSON):**
```json
{
  "nome": "Teclado Mecânico Pro",
  "descricao": "Versão atualizada com iluminação RGB",
  "preco": 349.90
}
```

---

### 🗑️ DELETE `/produtos/{id}` — Deletar produto

**Exemplo:** `DELETE /produtos/a3f9c1d2-...`

Retorna `200 OK` sem corpo na resposta.

---

## ▶️ Como Rodar

### Pré-requisitos

- Java 17 ou superior
- Maven instalado
- Nenhum banco de dados externo necessário — a aplicação usa **H2**, banco em memória já embutido no Spring Boot

> ⚠️ Os dados são apagados toda vez que a aplicação é reiniciada, pois o H2 roda em memória.

### Passos

```bash
# 1. Clone o repositório
git clone https://github.com/saopimbapow/apiestudos.git

# 2. Entre na pasta do projeto
cd apiestudos

# 3. Execute com Maven
./mvnw spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

---

## 🧪 Testando com Postman

A collection com todas as requisições já está disponível no repositório, pronta para importar!

### Importando a collection:

1. Abra o **Postman**
2. Clique em **Import** no canto superior esquerdo
3. Selecione o arquivo `apiestudos/postman/produtos-api.postman_collection.json`
4. Clique em **Import**
5. Todas as requisições já estarão configuradas ✅

> ⚠️ Lembre-se de rodar a aplicação localmente antes de testar. A base URL é `http://localhost:8080`

---

## 👨‍💻 Autor

Feito com 💻 e muito café por **Bernardo**

[![GitHub](https://img.shields.io/badge/GitHub-saopimbapow-181717?style=flat&logo=github)](https://github.com/saopimbapow)

---

> 📚 *Projeto desenvolvido para fins de aprendizado de Spring Boot e APIs REST.*
