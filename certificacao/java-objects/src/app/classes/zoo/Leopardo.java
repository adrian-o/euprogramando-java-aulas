package app.classes.zoo;

public class Leopardo extends Animal {
    public Leopardo() {
        super("Codigo Generico", "Leopardo Genérico");
    }

    public void fazSom() {
        super.fazSom();
        System.out.println("Roooooaaaarrrrrrrrrrrrr");
        super.fazOutroSom();
        System.out.println("Miau");
    }
}
