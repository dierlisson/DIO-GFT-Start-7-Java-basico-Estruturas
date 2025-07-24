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
                System.out.println("Digite um número: ");
                var numero = scanner.nextInt();
                System.out.println("O número digitado foi: " + numero);

                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                break;
            case "2":
                // EXERCICIO 2
                break;
            case "3":
                // EXERCICIO 3
                break;
            case "4":
                // EXERCICIO 4
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();

    }
}
