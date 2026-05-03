# SistemaFuncionarios

Sistema de cadastro e gerenciamento de funcionários desenvolvido em Java.

## Descrição

O sistema permite cadastrar funcionários em um departamento, aplicar reajustes salariais, registrar demissões e calcular a folha salarial dos funcionários ativos.

## Tecnologia utilizada

- Java 
- IDE:VScode

## Como executar

1. Certifique-se de ter o JDK instalado. Para verificar, abra o terminal e execute:
   ```
   java -version
   ```

2. Navegue até a pasta `src` do projeto:
   ```
   cd SistemaFuncionarios/src
   ```

3. Compile todos os arquivos `.java`:
   ```
   javac *.java
   ```

4. Execute a classe principal:
   ```
   java TesteSistema
   ```

## Classes do projeto

| Classe | Responsabilidade |
|---|---|
| `Funcionario` | Representa um funcionário com seus dados pessoais e profissionais. Possui métodos para alterar dados, aplicar reajuste, demitir e exibir informações. |
| `Departamento` | Agrupa funcionários em um setor. Gerencia a adição, listagem e cálculo da folha salarial. |
| `TesteSistema` | Classe principal com o método `main`. Executa o roteiro de testes simulando o uso real do sistema. |

## Aluno

- **Nome:** _Victor Hugo_
- **Turma:** Informática 2° periodo
