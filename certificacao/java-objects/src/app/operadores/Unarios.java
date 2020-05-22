package app.operadores;

public class Unarios {

    static int i = +1; // 2
    static int j = -1;
    static int x = ++i; // i = 2
    static int x1 = i++; // x1 = 2  
    static int y = j--; // i = 3
    static boolean b = (i > 0);
    static boolean b1 = !b;

    public static void main(String[] args) {
        System.out.println("Resultados \n i -> " + i + 
            " \n j -> " + j + " \n x -> " + x + " \n x1 -> " + x1 +
            " \n y -> " + y + " \n b -> " + b + " \n b1 -> " + b1);
    }
}