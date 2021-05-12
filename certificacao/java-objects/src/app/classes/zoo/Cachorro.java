package app.classes.zoo;

public class Cachorro extends Animal {
    public Cachorro() {
        super("Codigo Generico", "Cachorro Generico");
    }

    public void fazSom() {
        super.fazSom();
        System.out.println("Au au");
        super.fazOutroSom();
        System.out.println("--");
    }
}
