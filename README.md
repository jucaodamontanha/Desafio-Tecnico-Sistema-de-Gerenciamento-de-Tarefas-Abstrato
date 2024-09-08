# Sistema de Gerenciamento de Tarefas Abstrato

## Introdução

Bem-vindo ao Sistema de Gerenciamento de Tarefas Abstrato! Este documento irá guiá-lo através do processo de configuração e uso do sistema.

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes itens instalados em seu ambiente:

-   **Java 11**  ou superior
-   **Maven**  para gerenciamento de dependências
-   **Git**  para clonar o repositório

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

A aplicação estará disponível em  `http://localhost:8080`.

## Uso do Sistema

### 1. Adicionar uma Nova Tarefa

Para adicionar uma nova tarefa, siga os passos abaixo:

1.  Acesse a aplicação em  `http://localhost:8080`.
2.  Clique no botão “Adicionar Tarefa”.
3.  Preencha os detalhes da tarefa e clique em “Salvar”.

### 2. Visualizar Tarefas

Para visualizar todas as tarefas, navegue até a página principal da aplicação. Todas as tarefas serão listadas lá.

### 3. Editar uma Tarefa

Para editar uma tarefa existente:

1.  Clique no ícone de edição ao lado da tarefa que deseja editar.
2.  Atualize os detalhes da tarefa e clique em “Salvar”.

### 4. Excluir uma Tarefa

Para excluir uma tarefa:

1.  Clique no ícone de lixeira ao lado da tarefa que deseja excluir.
2.  Confirme a exclusão na janela de confirmação.

## Testes Automatizados

### Configuração dos Testes

Para configurar e executar os testes automatizados, siga os passos abaixo:

1.  Certifique-se de que todas as dependências de teste estão instaladas:
    
    ```bash
    mvn clean install
    
    ```
    
2.  Execute os testes:
    
    ```bash
    mvn test
    
    ```
    

### Exemplos de Testes

#### Testes Unitários com JUnit

```bash
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskManagerTest {

    @Test
    public void testAddTask() {
        TaskManager taskManager = new TaskManager();
        Task newTask = new Task(1, "Nova Tarefa");
        taskManager.addTask(newTask);
        assertTrue(taskManager.getTasks().contains(newTask));
    }
}

```

#### Testes de Interface com Selenium

```bash
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskManagerUITest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
    }

    @Test
    public void testAddTask() {
        WebElement taskNameInput = driver.findElement(By.name("taskName"));
        taskNameInput.sendKeys("Nova Tarefa");
        WebElement addButton = driver.findElement(By.name("addTask"));
        addButton.click();
        WebElement taskList = driver.findElement(By.tagName("ul"));
        assertTrue(taskList.getText().contains("Nova Tarefa"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
```
