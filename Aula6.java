public class Aula6{
	
	public static void main(String args[]) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);

                int operacao = -1;

                while (operacao != 0) {
                        System.out.println("Escolha a operação que você deseja: 1-Soma / 2-Subtração / 0-Sair");
                        operacao = scan.nextInt();

                        int resultado = 0;

                        if (operacao == 1) {
                        	System.out.println("Entre com o número 1: ");
                        	int num1 = scan.nextInt();
                        	System.out.println("Entre com o número 2: ");
                        	int num2 = scan.nextInt();
                        	resultado = num1+num2;
                        
                                System.out.println("O resultado da soma é: " + resultado);
                        } else if (operacao == 2) {
                        	System.out.println("Entre com o número 1: ");
                	        int num1 = scan.nextInt();
                	        System.out.println("Entre com o número 2: ");
                        	int num2 = scan.nextInt();
                        	resultado = num1-num2;

                                System.out.println("O resultado da subtração é: " + resultado);
                        } else if (operacao != 0) {
                        	System.out.println("A operação não é reconhecida pela calculadora");
                        }

                }

                System.out.println("Muito obrigado por usar a calculadora do Canal.");
	}

}