package app.arrays;

public class Multidimensionais {
    public static void main(String[] args) {
        // [[],[],[]] [[],[],[]] [[],[],[]]
        // new String[3][3];
        String[][] tabJogo = {
            {"_","_","_"},
            {"_","_","_"},
            {"_","_","_"}
        }; 
        
        tabJogo[1][1] = "X";
        tabJogo[2][1] = "O";
        tabJogo[0][2] = "X";
        tabJogo[2][0] = "O";
        tabJogo[2][2] = "X";
        tabJogo[1][2] = "O";
        tabJogo[0][0] = "X";

        imprimeTabuleiro(tabJogo);
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
}