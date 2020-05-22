package app.operadores;

public class Binarios {
    public static void main(String[] args) {
        int op1 = 3 + 4; // = 7
        int op2 = 4 - 8; // = -4
        int op3 = 12 / 3; // = 4
        int op4 = 3 * 5; // = 15 
        int op5 = 12 % 7; // 12 / 7 = 1 resta 5
        
        int op6 = 4 - 2 * (2 + 9); // = -18 

        System.out.println("Resultados..." +
        "\nOP1 -> " + op1 + "\nOP2 -> " + op2 + "\nOP3 -> " + op3 + 
        "\nOP4 -> " + op4 + "\nOP5 -> " + op5 + "\nOP6 -> " + op6);
    }
}