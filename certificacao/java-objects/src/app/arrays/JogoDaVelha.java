package app.arrays;

import java.util.Scanner;

public class JogoDaVelha {

    static String[][] tabJogo = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
    static String movimento = "";
    static String lc[] = null;
    static int linha;
    static int coluna;

    static String vencedor;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int op = 9;

        while (op > 0) {
            imprimeOpcoes();
            op = sc.nextInt();
            
            switch(op) {
                case 1: 
                    jogar();
                break;
                case 0:
                    System.out.println("Obrigado por jogar nosso jogo da velha");
                    System.exit(0);
            }
        }
    }

    static void jogar() {
        while(vencedor == null) {
            jogada("X");
            if (vencedor == null)
                jogada("O");
        } 
        
        System.out.println("\n*** Jogo terminado, quem venceu foi " + vencedor + " ***");
        vencedor = null;
    }

    static void jogada(String jogada) {
        System.out.println("\nEntre com a posição do item [" + jogada + "]: ");
        Scanner sca = new Scanner(System.in);
        while(true) {
            movimento = sca.next();
            lc = movimento.split(",");
            linha = Integer.parseInt(lc[0]);
            coluna = Integer.parseInt(lc[1]);
            if(linha < 2 && coluna < 2 && "_".equals(tabJogo[linha][coluna])) {
                tabJogo[linha][coluna] = jogada;
                imprimeTabuleiro(tabJogo);
                break;
            } else {
                System.out.println("Jogada inválida, refaça sua jogada...");
            }
        }
        validaVencedor(jogada);
    }

    static void validaVencedor(String jogada) {
        int pos = linha + coluna;
        if (pos == 1 || pos == 3) {
            if ((jogada.equals(tabJogo[linha][0]) 
                    && jogada.equals(tabJogo[linha][1])
                    && jogada.equals(tabJogo[linha][2])) || 
                    (jogada.equals(tabJogo[0][coluna]) 
                    && jogada.equals(tabJogo[1][coluna])
                    && jogada.equals(tabJogo[2][coluna]))) {
                vencedor = jogada;
            } 
        } else {
            int[][] posicoes = null;
            switch(pos) {
                case 0:
                case 4:
                    posicoes = new int[][]{{0,0},{1,1},{2,2}};
                    break;
                case 2:
                    posicoes = new int[][]{{0,2},{1,1},{2,0}};
                    break;
            }
    
            if (validaPosicoes(posicoes)) {
                vencedor = jogada;
            }
        }
    }

    static boolean validaPosicoes(int[][] posicoes) {
        return (posicoes != null &&
                tabJogo[posicoes[0][0]][posicoes[0][1]] == 
                    tabJogo[posicoes[1][0]][posicoes[1][1]] &&
                tabJogo[posicoes[1][0]][posicoes[1][1]] == 
                    tabJogo[posicoes[2][0]][posicoes[2][1]]);
    }

    static void imprimeTabuleiro(String[][] tabuleiro) {
        System.out.println("##############################");
        for (String[] linha : tabuleiro) {
            System.out.println();
            for (String coluna : linha) {
                System.out.print("[" + coluna + "]");
            }
        }
    }

    static void imprimeOpcoes() {
        System.out.println("############################");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Nova Partida");
        System.out.println("0 - Sair");
        System.out.println("############################");
    }
}