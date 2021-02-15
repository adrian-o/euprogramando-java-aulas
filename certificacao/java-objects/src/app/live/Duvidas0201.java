package app.live;

public class Duvidas0201 {

    static int[][][][][] game = new int[4][4][4][4][4];

    int[] inteiros = {};
    int[][] inteiros2 = new int[][]{};


    public static void main(String[] args) {

        int[][] array = new int[5][5];

        Object[] obj = array;


        // game[3][3][3] = 6;

        Object[][][][] objs = game;

        for(Object o : objs) {
            System.out.println(o.toString());
        }

        //game[3][3] = "X";

        // [25] [45] [82] [66]
        // [10] [99] [18] [76]

//        int[][] numeros = new int[2][4];
//        numeros[0][0] = 25;
//        numeros[0][1] = 45;
//        numeros[0][2] = 82;
//        numeros[0][3] = 66;
//        numeros[1][0] = 10;
//        numeros[1][1] = 99;
//        numeros[1][2] = 18;
//        numeros[1][3] = 76;
//
//        for(int lin = 0; lin < numeros.length; lin++) {
//            for(int col = 0; col < numeros[lin].length; col++) {
//                System.out.println("Linha: " + lin + " Coluna: " + col + " -> "  + numeros[lin][col]);
//            }
//        }

    }
}

// [linha 0 / coluna 0] [linha 0 / coluna 1] [linha 0 / coluna 2] [linha 0 / coluna 3]
// [linha 1 / coluna 0] [linha 1 / coluna 1] [linha 1 / coluna 2] [linha 1 / coluna 3]




