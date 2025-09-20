# 📚 API Biblioteca

Uma API REST desenvolvida em **Spring Boot** para gerenciar autores, biografias, livros e categorias, com relacionamentos entre as entidades.  

---

## 💻 Desenvolvedores

- Rodrigo Silveira
- Alison Barbosa
- Gustavo Travassos
- Darllan Cabral

---

## 🚀 Tecnologias
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco de Dados Relacional (MySQL, PostgreSQL, etc.)
- Lombok

---

## 📖 Entidades e Relacionamentos

- **Autor**  
  - Possui **uma biografia** (OneToOne)  
  - Pode ter **vários livros** (OneToMany)  

- **Biografia**  
  - Relacionada a **um único autor** (OneToOne)  

- **Livro**  
  - Pertence a **um único autor** (ManyToOne)  
  - Pode ter **várias categorias** (ManyToMany)  

- **Categoria**  
  - Pode estar associada a **vários livros** (ManyToMany)  

---

## 📌 Endpoints

### 🔹 AutorController `/autor`

| Método   | Endpoint      | Descrição |
|----------|---------------|-----------|
| **POST** | `/autor`      | Cria um novo autor. |
| **GET**  | `/autor`      | Retorna a lista de todos os autores. |
| **GET**  | `/autor/{id}` | Retorna os dados de um autor específico pelo ID. |

#### Exemplo JSON de Autor
```json
{
  "nome": "Machado de Assis",
  "idade": 68
}

```

### 🔹BiografiaController `/biografia`

| **Método** |	`Endpoint` |	Descrição |
|----------|---------------|-----------|
| **GET**	| `/biografia`	| Retorna a lista de todas as biografias.|
| **GET**	| `/biografia/{id}` |	Retorna os dados de uma biografia específica pelo ID.|
| **POST**	| `/biografia`	| Cria uma nova biografia associada a um autor.|

#### Exemplo JSON de Biografia

``` json
{
  "titulo": "Escritor Brasileiro do Século XIX",
  "autor": {
    "id": 1
  }
}
```

### 🔹LivroController `/livro`

| Método | Endpoint | Descrição |
|--------|----------|-----------|
|   **POST**     |    `/livro`      |    Adiciona um novo livro.       |
|     **POST**   |       `/livro/{idLivro}/categorias/{idCategoria}`   |    Associa uma categoria existente a um livro.       |
|   **DELETE**     |    `/livro/{livroId}`      |     Deleta um livro pelo ID.      |
|   **GET**     |      `/livro`    |   Retorna todos os livros cadastrados.        |
|   **GET**     |      `/livro/{id}`    |    Retorna os dados de um livro específico pelo ID.       |

#### Exemplo JSON de Livro

``` json
{
  "titulo": "Dom Casmurro",
  "autor": {
    "id": 1
  }
}
```

### 🔹 CategoriaController `/categoria`

| Método | Endpoint | Descrição |
|--------|----------|-----------|
|   **POST**     |    `/categoria`      |   Cria uma nova categoria.        |
|     **GET**   |       `/categoria`   |    Retorna a lista de todas as categorias.       |
|   **GET**     |    `/categoria/{id}`      |   Retorna os dados de uma categoria específica pelo ID.        |

#### Exemplo JSON de Categoria

``` json
{
  "name": "Romance"
}
```

---

## 📂 Estrutura dos Relacionamentos no Banco

- **autor** (id, nome, idade)

- **biografia** (id, titulo, autor_id)

- **livro** (id, titulo, autor_id)

- **categoria** (id, name)

- **livro_categoria** (livro_id, categoria_id) (tabela de junção ManyToMany)

## 🛠️ Futuras Melhorias

Implementar **atualização (PUT)** para entidades.

- Adicionar **validações** (ex: não permitir livro sem autor).

- Criar **tratamento global de exceções.**

- Documentar API com **Swagger/OpenAPI.**

