import java.util.Scanner;

public class Aula5 {
	public static void main(String args[]) {
		// java.util.Scanner scan = new java.util.Scanner(System.in);

		Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a opção: 1-Soma / 2-Subtração");
        System.out.println();
        int opcao = scan.nextInt();
        
        System.out.println("Entre com o número 1: ");
        int num1 = 4;

        System.out.println("Entre com o número 2: ");
        int num2 = 2;

        String operacao = "OPERAÇÃO INDEFINIDA";
        int resultado = 0;

        // se o usuário escolher a opcao 1 entao faca:
        // 	soma o num1 com o num2
        if (opcao == 1) {
        	System.out.println("Vai fazer uma soma...");
        	operacao = "soma";
        	resultado = num1+num2;
        }

        // se o usuário escolher a opcao 2 entao faca:
        // 	subtrai o num2 do num1
        if (opcao == 2) {
        	System.out.println("Vai fazer uma subtração...");
        	operacao = "subtração";
        	resultado = num1-num2;
        }

        System.out.println("O NOVO resultado da " + operacao + " é: " + resultado);
	}
}