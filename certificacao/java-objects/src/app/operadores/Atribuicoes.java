package app.operadores;

public class Atribuicoes {
    public static void main(String[] args) {
        int x = 0;
        int z = 10;
        
        // += -= *= /=

        System.out.println("x -> " + (x = z /= 2) + 
                            "\nz -> " + (z += 2));

        System.out.println("Novo valor do X -> " + x);
        System.out.println("Novo valor do Z -> " + z);
    }
}