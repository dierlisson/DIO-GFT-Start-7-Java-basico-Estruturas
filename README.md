
# Exercícios - Fundamentos da Linguagem de Programação Java

Este repositório contém uma atividade prática desenvolvida em Java, com o objetivo de exercitar a entrada de dados via terminal e manipulação de informações básicas. O código apresenta um menu com **4 exercícios** que podem ser escolhidos pelo usuário para execução.

## 📋 Requisitos

- Java JDK 8 ou superior  
- Terminal ou IDE compatível com execução de aplicações Java

## 🚀 Como Executar

1. Clone este repositório ou copie o código-fonte para um arquivo chamado `Main.java`.

2. Compile o código usando o terminal:
   ```bash
   javac Main.java
   ```

3. Execute o programa:
   ```bash
   java Main
   ```

4. Será exibido um menu com os seguintes exercícios:
   ```
   Exercícios
   1- Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
   2- Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo do seu IMC;
   3- Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolha entre a opção par ou ímpar. O programa irá exibir todos os números do tipo escolhido no intervalo informado, em ordem decrescente;
   4- Escreva um código onde o usuário informa um número inicial, e posteriormente irá informar outros N números. A execução continuará até que o número informado não seja múltiplo do primeiro número. Números menores que o número inicial serão ignorados.
   ```

5. Digite o número do exercício desejado e siga as instruções no terminal.

## 📌 Observações

- O programa utiliza a estrutura `switch` para controle do exercício selecionado.
- O cálculo de IMC no exercício 2 segue os parâmetros da OMS.
- O exercício 3 lida com intervalos numéricos e classificação par/ímpar.
- O exercício 4 demonstra lógica de repetição com verificação de múltiplos.
- Certifique-se de fornecer dados válidos conforme solicitado pelo terminal.

## 🧑‍💻 Autor

Atividade desenvolvida como exercício proposto pelo professor da DIO no bootcamp GFT Start #7 - Java, no curso **Fundamentos da Linguagem de Programação Java**.

---

```java
// Estrutura básica usada no código:
switch (execicio) {
    case "1": // Tabuada
    case "2": // Cálculo do IMC
    case "3": // Números pares/ímpares no intervalo
    case "4": // Verificação de múltiplos
    default:  // Tratamento de opção inválida
}
```
---
