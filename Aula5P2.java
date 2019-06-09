public class Aula5P2{
	
	public static void main(String args[]) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Entre com a opção: 1-Soma / 2-Subtração / 0-Sair");
        int opcao = scan.nextInt();

        String operacao = "";
        int resultado = 0;

        if (opcao == 1) {
        	System.out.println("Entre com o número 1: ");
        	int num1 = scan.nextInt();
        	System.out.println("Entre com o número 2: ");
        	int num2 = scan.nextInt();
        	operacao = "soma";
        	resultado = num1+num2;
        } else if (opcao == 2) {
        	System.out.println("Entre com o número 1: ");
	        int num1 = scan.nextInt();
	        System.out.println("Entre com o número 2: ");
        	int num2 = scan.nextInt();
        	operacao = "subtração";
        	resultado = num1-num2;
        } else {
        	operacao = "OPERAÇÃO INDEFINIDA";
        }

        System.out.println("O resultado da " + operacao + " é: " + resultado);

	}

}