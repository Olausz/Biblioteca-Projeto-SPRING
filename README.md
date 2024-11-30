# Sistema de Biblioteca - API RESTful
Tecnologias Usadas e Funcionamento da API
Esta API foi desenvolvida para simular um sistema de gerenciamento de biblioteca, utilizando as seguintes tecnologias:

Java e Spring Boot: Para o desenvolvimento do back-end e criação de uma API RESTful seguindo boas práticas de arquitetura.<br>

Swagger: Ferramenta utilizada para documentar e testar os endpoints da API.<br>

PostgreSQL: Banco de dados relacional utilizado para armazenar informações da aplicação.<br>

DBeaver: Gerenciador de banco de dados usado para administrar e visualizar o PostgreSQL.<br>

A API foi estruturada seguindo os princípios REST, garantindo uma comunicação eficiente e padronizada. A divisão da aplicação em camadas como Controller, Service, Repository e Model assegura uma separação de responsabilidades clara e organizada, facilitando a manutenção e a escalabilidade do sistema.
Os endpoints da API permitem realizar operações básicas de CRUD (Create, Read, Update, Delete) para gerenciar informações como livros, autores e leitores. O Swagger foi configurado para testar e validar essas operações de forma prática e direta.

# Arquitetura do Banco de Dados
O banco de dados foi projetado com uma estrutura relacional, visando atender às necessidades de uma biblioteca. As tabelas principais incluem:

Livros: Armazena informações sobre os livros disponíveis.<br>

Clientes: Contém dados relacionados aos Clientess.<br>

Livros Comprados: Relaciona Clientes e livros, registrando os empréstimos realizados.<br>

As tabelas são interligadas por meio de chaves estrangeiras, garantindo consistência e integridade dos dados.<br>

# Incrementações Futuras
Planejo aprimorar o projeto nos próximos meses, implementando as seguintes melhorias:

Frontend Dinâmico<br>

Desenvolvimento de uma interface limpa e moderna utilizando React e CSS.
Integração com Node.js para a criação de uma comunicação eficiente entre o front-end e a API.
Melhorias na Interface do Usuário

Design intuitivo e acessível, focado em melhorar a experiência do usuário final.
Implementação de painéis para visualizar informações sobre livros, empréstimos e leitores.
Criação de Novas Entidades

Adicionar novas funcionalidades como categorias de livros, gerenciamento de funcionários e controle de reservas.
Ajustar atributos e métodos das entidades atuais para torná-las mais completas e alinhadas com as necessidades do sistema.
Com essas melhorias, o sistema de biblioteca evoluirá para uma aplicação mais robusta, funcional e com maior valor agregado para os usuários. 🚀
