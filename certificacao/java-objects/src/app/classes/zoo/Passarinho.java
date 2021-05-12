package app.classes.zoo;

public class Passarinho extends Animal {
    public Passarinho() {
        super("Codigo Generico", "Passarinho Generico");
    }

    public void fazSom() {
        super.fazSom();
        System.out.println("Piu piu");
        super.fazOutroSom();
        System.out.println("--");
    }
}
