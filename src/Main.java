import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println(
                "Exercícios\n1- Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;\n2- Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC;\n3- Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;\n4- Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados.\n");
        System.out.println("Digite o número do exercício que deseja executar:");
        var execicio = scanner.nextLine();

        switch (execicio) {
            case "1":
                // EXERCICIO 1
                System.out.println("\nBem vindo a Tabuada\n");
                System.out.println("Digite um número: ");
                var numero = scanner.nextInt();
                System.out.println("O número digitado foi: " + numero);

                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                break;
            case "2":
                // EXERCICIO 2
                System.out.println("\nBem vindo ao IMC\n");
                System.out.println("Digite sua altura separando por vírgula metros e centímetros: ");
                var altura = scanner.nextDouble();
                System.out.println("Digite seu peso: ");
                var peso = scanner.nextDouble();
                var imc = peso / (altura * altura);
                System.out.println("Seu IMC é: " + imc);
                if (imc <= 18.5) {
                    System.out.println("Abaixo do peso");
                } else if (imc > 18.5 && imc < 25.0) {
                    System.out.println("Peso ideal");
                } else if (imc >= 25.0 && imc < 30.0) {
                    System.out.println("Levemente acima do peso");
                } else if (imc >= 30.0 && imc < 35.0) {
                    System.out.println("Obesidade Grau I");
                } else if (imc >= 35.0 && imc < 40.0) {
                    System.out.println("Obesidade Grau II (Severa)");
                } else {
                    System.out.println("Obesidade III (Mórbida)");
                }
                break;
            case "3":
                // EXERCICIO 3
                System.out.println("\nBem vindo - Par ou Ímpar no intervalo de números informados\n");
                System.out.println("Digite um número: ");
                var numero1 = scanner.nextInt();
                System.out.println("Digite um número maior que o primeiro: ");
                var numero2 = scanner.nextInt();
                System.out.println(
                        "Você quer selecionar os números pares ou ímpares do intervalo informado? digite 1 para IMPAR ou 2 para PAR': ");
                var opcao = scanner.nextInt();

                System.err.println("Seguem abaixo os números em ordem decrescente do intervalo informado:\n");

                if (opcao == 1) {
                    for (int i = numero2; i >= numero1; i--) {
                        if (i % 2 != 0) {
                            System.out.println(i);
                        }
                    }
                } else if (opcao == 2) {
                    for (int i = numero2; i >= numero1; i--) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                } else {
                    System.out.println("Opção inválida - " + opcao);
                }
                break;
            case "4":
                // EXERCICIO 4
                System.out.println("\nBem vindo - Resto zero \n");

                System.out.println("Digite um número: ");
                var num1 = scanner.nextInt();
                var num2 = 0;
                var result = 0;
                do {
                    System.out.println("\nDigite outro número para verificação: ");
                    num2 = scanner.nextInt();
                    while (num2 < num1) {
                        System.err.printf("Informe um número maior que %s:  ", num1);
                        num2 = scanner.nextInt();
                    }
                    result = num2 % num1;
                    System.err.printf("\n%s %% %s = %s\n", num2, num1, result);
                } while (result != 0);
                System.err.printf(
                        "\nO resto da divisão de %s por %s é igual a %s.", num2, num1, result);

                /*
                 * 
                 * //Resolução do professor:
                 * 
                 * System.err.println("Informe um número");
                 * var number = scanner.nextInt();
                 * while (true) {
                 * System.err.println("Informe o número para verificação");
                 * var toVerify = scanner.nextInt();
                 * if (toVerify < number) {
                 * System.err.printf("Informe um número maior que %s", number);
                 * continue;
                 * }
                 * var result = toVerify % number;
                 * System.err.printf("%s %% %s = %s\n", toVerify, number, result);
                 * if (result != 0)
                 * break;
                 * }
                 */
                
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();

    }
}
