# Projeto DSMovie
![GitHub repo size](https://img.shields.io/github/repo-size/paulorosmaninho/dsmovie)
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/paulorosmaninho/dsmovie/blob/master/LICENSE) 

### Disponível no Netlify (front-end) e Heroku (back-end) através das URLs:
* https://pr-dsmovie.netlify.app/
* https://pr-dsmovie.herokuapp.com

# Sobre o projeto

O projeto DSMovie é uma aplicação full stack front-end e back-end, para avaliar filmes. Ela foi construída durante a semana Spring React, que aconteceu do dia 10 ao dia 14/01/2022, na escola DevSuperior do professor Nélio Alves.
Nesse evento foram apresentados conceitos de:
* HTML
* CSS
* Bootstrap
* JavaScript
* ReactJS
* Maven
* Java
* Spring Boot

O front-end da aplicação foi construído com ReactJS e o back-end são microserviços REST construídos com Java 17 e framework Spring.

A aplicação apresenta uma lista paginada de filmes. Ao clicar no botão avaliar o usuário é levado até uma página com um formulário, onde ele informa seu e-mail e uma nota para o filme. O e-mail e a nota são registrados e a nota geral do filme é atualizada na página da lista de filmes.

### Lista de filmes
![Web 1](https://github.com/paulorosmaninho/assets/blob/master/dsmovie/lista.png)

### Formulário de avaliação
![Web 2](https://github.com/paulorosmaninho/assets/blob/master/dsmovie/form-avaliacao.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Front end
- HTML / CSS / JS
- Bootstrap
- ReactJS

## Implantação em produção
- Front-end: Netlify
- Back-end: Heroku
- Banco de dados de teste: H2
- Banco de dados de desenvolvimento e produção: PostgreSQL

# Como executar o projeto

```bash
# clonar repositório
git clone https://github.com/paulorosmaninho/dsmovie.git

# front-end - entrar na pasta local do projeto
exemplo: cd dsmovie\frontend
# executar o comando abaixo
yarn start

# back-end - entrar na pasta local do projeto
exemplo: cd dsmovie\backend
# executar o comando abaixo
mvnw spring-boot:run

# abrir o browser de sua preferência e digitar
localhost:3000
```

## Back end
Pré-requisitos: 
Java versão 17
PostgreSQL versão 13

# Autor
Paulo Rosmaninho

[![NPM](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://br.linkedin.com/in/paulorosmaninho?trk=people-guest_people_search-card)
