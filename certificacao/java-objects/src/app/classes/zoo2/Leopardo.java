package app.classes.zoo2;

public class Leopardo extends Animal {

    public Integer numeroPatas;

    public Leopardo(String codigo, String nome, boolean predador, Integer numeroPatas) {
        super(codigo, nome, predador, numeroPatas);
        this.numeroPatas = 3;
        this.setNumeroPatas(5);
        super.setNumeroPatas(6);
        System.out.println(this.getClass().getSimpleName() + ": " + this.getNome());
        System.out.println(predador);
    }

    public void locomover() {
        System.out.println("O Leopardo se move com " + super.numeroPatas +
                " patas e " + this.numeroPatas + " patas...");
    }

    public void fazSom() {
        super.fazSom();
        System.out.println("Roooooaaaarrrrrrrrrrrrr");
        super.fazOutroSom();
        System.out.println("Miau");
    }

    public void cacar() {
        super.cacar();
        System.out.println("E também é um dos animais mais rápidos do mundo... Caça mortal...");
    }

    public void cacar(int i) {
        super.cacar();
        System.out.println("E também é um dos animais mais rápidos do mundo... Caça mortal...");
    }
}
