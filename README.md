# Instruções de Uso da API REST

A API REST foi desenvolvida para gerenciar notícias e categorias em um sistema. Neste documento, você encontrará instruções sobre como usar os endpoints disponíveis na API.

## Endpoints

### Notícias

#### Listar todas as notícias

- **Endpoint:** `/lista-noticias`
- **Método:** GET
- **Descrição:** Retorna uma lista de todas as notícias cadastradas no sistema.
- **Exemplo de Uso:** `GET http://seuservidor.com/lista-noticias`
- **Resposta:** Retorna uma lista de notícias em formato JSON.

#### Pesquisar notícias por título

- **Endpoint:** `/lista-noticias?busca={termo}`
- **Método:** GET
- **Descrição:** Retorna uma lista de notícias que correspondem ao termo de pesquisa especificado no título.
- **Exemplo de Uso:** `GET http://seuservidor.com/lista-noticias?busca=termo`
- **Resposta:** Retorna uma lista de notícias em formato JSON que correspondem ao termo de pesquisa.

#### Cadastrar uma nova notícia

- **Endpoint:** `/noticias`
- **Método:** POST
- **Descrição:** Cria uma nova notícia com os dados fornecidos no corpo da solicitação.
- **Exemplo de Uso:** `POST http://seuservidor.com/noticias`
- **Corpo da Solicitação:** Deve incluir os dados da notícia no formato JSON.
- **Resposta:** Retorna a notícia criada em formato JSON ou uma mensagem de erro, se aplicável.

### Categorias

#### Listar todas as categorias

- **Endpoint:** `/categoria`
- **Método:** GET
- **Descrição:** Retorna uma lista de todas as categorias cadastradas no sistema.
- **Exemplo de Uso:** `GET http://seuservidor.com/categoria`
- **Resposta:** Retorna uma lista de categorias em formato JSON.

#### Cadastrar uma nova categoria

- **Endpoint:** `/categoria`
- **Método:** POST
- **Descrição:** Cria uma nova categoria com os dados fornecidos no corpo da solicitação.
- **Exemplo de Uso:** `POST http://seuservidor.com/categoria`
- **Corpo da Solicitação:** Deve incluir os dados da categoria no formato JSON.
- **Resposta:** Retorna a categoria criada em formato JSON ou uma mensagem de erro, se aplicável.

## Exemplos de Uso

### Listar todas as notícias

```
GET http://seuservidor.com/lista-noticias
```

### Pesquisar notícias por título

```
GET http://seuservidor.com/lista-noticias?busca=termo
```

### Cadastrar uma nova notícia

```
POST http://seuservidor.com/noticias
Corpo da Solicitação:
{
    "titulo": "Título da Notícia",
    "conteudo": "Conteúdo da notícia",
    "categoria": "Categoria da Notícia"
}
```

### Listar todas as categorias

```
GET http://seuservidor.com/categoria
```

### Cadastrar uma nova categoria

```
POST http://seuservidor.com/categoria
Corpo da Solicitação:
{
    "categoria": "Nome da Categoria"
}
```

Lembre-se de substituir `http://seuservidor.com` pela URL real do seu servidor onde a API está hospedada.