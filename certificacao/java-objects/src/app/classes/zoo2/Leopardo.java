package app.classes.zoo2;

public class Leopardo extends Animal {
    public Leopardo(String codigo, String nome, boolean predador, Integer numeroPatas) {
        super(codigo, nome, predador, numeroPatas);
        System.out.println(this.getClass().getSimpleName() + ": " + this.getNome());
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
