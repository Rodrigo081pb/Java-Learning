# My API - Sistema de Gerenciamento de Usuários

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.2-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-25-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## 📋 Descrição

API REST desenvolvida com Spring Boot para gerenciamento de usuários. Este projeto faz parte do curso da Digital Innovation One (DIO) e demonstra conceitos fundamentais de desenvolvimento de APIs REST com documentação automática usando SpringDoc OpenAPI (Swagger).

## 🚀 Funcionalidades

- ✅ **Criar usuário**: Cadastro de novos usuários no sistema
- ✅ **Listar usuários**: Visualização de todos os usuários cadastrados
- ✅ **Buscar usuário**: Pesquisa de usuário específico por login
- ✅ **Deletar usuário**: Remoção de usuários do sistema
- ✅ **Documentação interativa**: Interface Swagger UI para testes da API

## 🛠️ Tecnologias Utilizadas

- **Java 25**
- **Spring Boot 4.0.2**
- **Spring Web**
- **SpringDoc OpenAPI 2.3.0** (Swagger UI)
- **Maven** - Gerenciamento de dependências

## 📦 Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- Java JDK 25 ou superior
- Maven 3.6+ (ou use o Maven Wrapper incluído no projeto)
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code, etc.)

## 🔧 Instalação e Execução

### 1. Clone o repositório
```bash
git clone <url-do-repositorio>
cd myApi
```

### 2. Compile o projeto
```bash
# Windows
.\mvnw.cmd clean install

# Linux/Mac
./mvnw clean install
```

### 3. Execute a aplicação
```bash
# Windows
.\mvnw.cmd spring-boot:run

# Linux/Mac
./mvnw spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

## 📚 Documentação da API

Após iniciar a aplicação, acesse a documentação interativa:

- **Swagger UI**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- **OpenAPI JSON**: [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

## 🔌 Endpoints Disponíveis

### Welcome
- `GET /` - Mensagem de boas-vindas

### Usuários
- `GET /users/AllUsers` - Lista todos os usuários
- `GET /users/{username}` - Busca usuário por login
- `POST /users/createUser` - Cria novo usuário
- `DELETE /users/deleteUser/{id}` - Deleta usuário por ID

## 📝 Exemplos de Uso

### Criar Usuário
```bash
curl -X POST http://localhost:8080/users/createUser \
  -H "Content-Type: application/json" \
  -d '{
    "login": "joao",
    "senha": "senha123"
  }'
```

### Listar Todos os Usuários
```bash
curl -X GET http://localhost:8080/users/AllUsers
```

### Buscar Usuário por Login
```bash
curl -X GET http://localhost:8080/users/joao
```

### Deletar Usuário
```bash
curl -X DELETE http://localhost:8080/users/deleteUser/1
```

## 📂 Estrutura do Projeto

```
myApi/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── dio/
│   │   │       └── myApi/
│   │   │           ├── MyApiApplication.java          # Classe principal
│   │   │           ├── controllers/                   # Controllers REST
│   │   │           │   ├── UsuarioController.java
│   │   │           │   └── WelcomeController.java
│   │   │           ├── doc/                           # Configuração Swagger
│   │   │           │   └── SwaggerConfig.java
│   │   │           ├── models/                        # Modelos de dados
│   │   │           │   └── Usuario.java
│   │   │           └── repositorys/                   # Repositórios
│   │   │               └── UserRepository.java
│   │   └── resources/
│   │       └── application.properties                 # Configurações
│   └── test/                                          # Testes unitários
├── pom.xml                                            # Dependências Maven
└── README.md                                          # Este arquivo
```

## ⚙️ Configurações

As principais configurações da aplicação estão no arquivo `application.properties`:

- **Porta do servidor**: 8080
- **Swagger UI**: Habilitado
- **Logging**: Nível INFO
- **Encoding**: UTF-8

## 🧪 Testes

Execute os testes com:

```bash
# Windows
.\mvnw.cmd test

# Linux/Mac
./mvnw test
```

## 📄 Licença

Este projeto está licenciado sob a Apache License 2.0 - veja o arquivo [LICENSE](https://www.apache.org/licenses/LICENSE-2.0) para detalhes.

## 👨‍💻 Autor

**Rodrigo**
- Email: rodrigo@exemplo.com.br
- Website: [http://www.exemplo.com.br](http://www.exemplo.com.br)

## 🎓 Projeto Educacional

Este projeto foi desenvolvido como parte do curso da **Digital Innovation One (DIO)** para demonstrar conceitos de desenvolvimento de APIs REST com Spring Boot.

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## 📞 Suporte

Se você tiver alguma dúvida ou problema, por favor abra uma issue no repositório.

---

⭐ Se este projeto foi útil para você, considere dar uma estrela!

