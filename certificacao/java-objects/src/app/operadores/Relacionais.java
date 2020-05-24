package app.operadores;

public class Relacionais implements IRelacionais {
    public static void main(String[] args) {
        int x = 10;
        int y = 11;

        IRelacionais rel = new Relacionais();
        IRelacionais rel2 = new Relacionais();

        System.out.println(rel == rel2);

        // System.out.println("Rel: " + (rel instanceof Relacionais));
        // System.out.println("Rel: " + (rel instanceof Binarios));

        // System.out.println("Rel2: " + (rel2 instanceof Relacionais));
        // System.out.println("Rel2: " + (rel2 instanceof Binarios));

        // System.out.println(x > y);
        // System.out.println(x >= y);
        // System.out.println(x < y);
        // System.out.println(x <= y);
        // System.out.println(x == y);
        // System.out.println(x == (y-=1));
    }
}