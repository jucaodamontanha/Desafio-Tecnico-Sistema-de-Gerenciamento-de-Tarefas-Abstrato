# Sistema de Gerenciamento de Tarefas Abstrato

## Introdução

Bem-vindo ao Sistema de Gerenciamento de Tarefas Abstrato! Este documento irá guiá-lo através do processo de configuração e uso do sistema.

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes itens instalados em seu ambiente:

- **Java 11** ou superior
- **Maven** para gerenciamento de dependências
- **Git** para clonar o repositório

## Passo a Passo para Configuração

### 1. Clonar o Repositório

Primeiro, clone o repositório do GitHub para o seu ambiente local:

```bash
git clone https://github.com/jucaodamontanha/Desafio-Tecnico-Sistema-de-Gerenciamento-de-Tarefas-Abstrato.git
cd Desafio-Tecnico-Sistema-de-Gerenciamento-de-Tarefas-Abstrato
```
### 2. Compilar o Projeto
Navegue até o diretório do projeto e compile-o usando o Maven:

```bash
mvn clean install
```
### 3. Executar a Aplicação
Após a compilação, você pode executar a aplicação com o seguinte comando:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em http://localhost:8080.

# Uso do Sistema

### 1. Adicionar uma Nova Tarefa
Para adicionar uma nova tarefa, siga os passos abaixo:

Acesse a aplicação em http://localhost:8080.
Clique no botão “Adicionar Tarefa”.
Preencha os detalhes da tarefa e clique em “Salvar”.
### 2. Visualizar Tarefas
Para visualizar todas as tarefas, navegue até a página principal da aplicação. Todas as tarefas serão listadas lá.
### 3. Editar uma Tarefa
Para editar uma tarefa existente:

Clique no ícone de edição ao lado da tarefa que deseja editar.
Atualize os detalhes da tarefa e clique em “Salvar”.

### 4. Excluir uma Tarefa
Para excluir uma tarefa:

Clique no ícone de lixeira ao lado da tarefa que deseja excluir.
Confirme a exclusão na janela de confirmação.


