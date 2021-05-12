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

    public void cacar() {
        if (!predador) {
            System.out.println("Animal não é um predador, não pode caçar");
            return;
        }

        if (getNumeroPatas() > 2) {
            System.out.println("Animal caça rápido");
        }
    }
}
