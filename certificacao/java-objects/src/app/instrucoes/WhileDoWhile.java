package app.instrucoes;

import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);

        do {
            montaMenu();
            op = sc.nextInt();
            realizaAcao(op);
        } while (op > 0);

        while (op > 0) {
            montaMenu();
            op = sc.nextInt();
            realizaAcao(op);
        }

        System.out.println("\nMuito obrigado por usar nosso "
                          +"programa de cadastro...\n");
        sc.close();
    }

    private static void montaMenu() {
        System.out.println("");
        System.out.println("............Menu do Programa............");
        System.out.println("1-Cadastro");
        System.out.println("2-Consulta");
        System.out.println("0-Sair");
        System.out.println("........................................");
        System.out.print("Entre com a opção que você deseja: ");
    }

    private static void realizaAcao(int op) {
        switch (op) {
            case 1: 
                System.out.println("Faz o cadastro...");
                break;
            case 2:
                System.out.println("Faz a consulta...");
                break;
            case 0:
                break;
            default:
                System.out.println("Opção desconhecida...");
                break;
        }
    }
}