# Guia de Uso da API

## 📖 Introdução

Este guia fornece informações detalhadas sobre como usar a API de Gerenciamento de Usuários.

## 🌐 Base URL

```
http://localhost:8080
```

## 🔐 Autenticação

Atualmente, a API não requer autenticação. Em produção, recomenda-se implementar:
- Spring Security
- JWT (JSON Web Tokens)
- OAuth2

## 📋 Endpoints Detalhados

### 1. Mensagem de Boas-vindas

**Endpoint:** `GET /`

**Descrição:** Retorna uma mensagem de boas-vindas da API.

**Resposta de Sucesso:**
- **Código:** 200 OK
- **Conteúdo:** `"Welcome to my API!"`

**Exemplo:**
```bash
curl -X GET http://localhost:8080/
```

---

### 2. Listar Todos os Usuários

**Endpoint:** `GET /users/AllUsers`

**Descrição:** Retorna uma lista com todos os usuários cadastrados no sistema.

**Resposta de Sucesso:**
- **Código:** 200 OK
- **Conteúdo:**
```json
[
  {
    "id": null,
    "login": "user1",
    "senha": "senha1"
  },
  {
    "id": null,
    "login": "user2",
    "senha": "senha2"
  }
]
```

**Exemplo:**
```bash
curl -X GET http://localhost:8080/users/AllUsers
```

---

### 3. Buscar Usuário por Login

**Endpoint:** `GET /users/{username}`

**Descrição:** Retorna um usuário específico através do seu nome de login.

**Parâmetros de URL:**
- `username` (obrigatório): Nome de login do usuário

**Resposta de Sucesso:**
- **Código:** 200 OK
- **Conteúdo:**
```json
{
  "id": null,
  "login": "joao",
  "senha": "senhaExemplo"
}
```

**Resposta de Erro:**
- **Código:** 404 NOT FOUND
- **Descrição:** Usuário não encontrado

**Exemplo:**
```bash
curl -X GET http://localhost:8080/users/joao
```

---

### 4. Criar Novo Usuário

**Endpoint:** `POST /users/createUser`

**Descrição:** Cadastra um novo usuário no sistema.

**Corpo da Requisição:**
```json
{
  "login": "novousuario",
  "senha": "senha123"
}
```

**Headers:**
- `Content-Type: application/json`

**Resposta de Sucesso:**
- **Código:** 200 OK

**Resposta de Erro:**
- **Código:** 400 BAD REQUEST
- **Descrição:** Dados inválidos fornecidos

**Exemplo:**
```bash
curl -X POST http://localhost:8080/users/createUser \
  -H "Content-Type: application/json" \
  -d '{
    "login": "maria",
    "senha": "senha456"
  }'
```

---

### 5. Deletar Usuário

**Endpoint:** `DELETE /users/deleteUser/{id}`

**Descrição:** Remove um usuário do sistema através do seu ID.

**Parâmetros de URL:**
- `id` (obrigatório): ID do usuário a ser deletado

**Resposta de Sucesso:**
- **Código:** 200 OK

**Resposta de Erro:**
- **Código:** 404 NOT FOUND
- **Descrição:** Usuário não encontrado

**Exemplo:**
```bash
curl -X DELETE http://localhost:8080/users/deleteUser/1
```

---

## 🎯 Testando com Swagger UI

A maneira mais fácil de testar a API é usando o Swagger UI:

1. Inicie a aplicação
2. Acesse: http://localhost:8080/swagger-ui.html
3. Navegue pelos endpoints disponíveis
4. Clique em "Try it out" para testar cada endpoint
5. Preencha os parâmetros necessários
6. Clique em "Execute" para enviar a requisição

## 📊 Códigos de Status HTTP

| Código | Descrição |
|--------|-----------|
| 200 | OK - Requisição bem-sucedida |
| 400 | Bad Request - Dados inválidos |
| 404 | Not Found - Recurso não encontrado |
| 500 | Internal Server Error - Erro no servidor |

## 🔄 Modelo de Dados

### Usuario

```json
{
  "id": integer,
  "login": string,
  "senha": string
}
```

**Campos:**
- `id` (integer, opcional): Identificador único do usuário
- `login` (string, obrigatório): Nome de login do usuário
- `senha` (string, obrigatório): Senha do usuário

## 💡 Dicas e Boas Práticas

### Para Desenvolvimento
1. Use o Swagger UI para explorar e testar a API
2. Verifique os logs do console para mensagens de debug
3. Use ferramentas como Postman ou Insomnia para testes mais complexos

### Para Produção
1. **Segurança:**
   - Implemente autenticação e autorização
   - Nunca retorne senhas em texto plano
   - Use HTTPS

2. **Validação:**
   - Adicione validações de entrada (@Valid, @NotNull, etc.)
   - Implemente tratamento de exceções global

3. **Banco de Dados:**
   - Substitua o repositório mock por JPA/Hibernate
   - Configure conexão com banco de dados real (PostgreSQL, MySQL, etc.)

4. **Logging:**
   - Configure logs estruturados
   - Use níveis apropriados (DEBUG, INFO, WARN, ERROR)

5. **Testes:**
   - Implemente testes unitários
   - Adicione testes de integração

## 🐛 Troubleshooting

### Problema: Porta 8080 já está em uso
**Solução:** Altere a porta no `application.properties`:
```properties
server.port=8081
```

### Problema: Erro ao iniciar a aplicação
**Solução:** Verifique se:
- Java 25 está instalado corretamente
- Todas as dependências Maven foram baixadas
- Não há erros de compilação

### Problema: Swagger UI não carrega
**Solução:** 
- Verifique se a aplicação está rodando
- Acesse: http://localhost:8080/v3/api-docs para verificar se o JSON está disponível
- Limpe o cache do navegador

## 📞 Suporte

Para mais informações ou suporte, entre em contato:
- Email: rodrigo@exemplo.com.br
- Website: http://www.exemplo.com.br

---

**Última atualização:** 2026

