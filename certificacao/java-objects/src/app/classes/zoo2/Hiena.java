package app.classes.zoo2;

public class Hiena extends Animal {
    public Hiena(String codigo, String nome, boolean predador, Integer numeroPatas) {
        super(codigo, nome, predador, numeroPatas);
        System.out.println(this.getClass().getSimpleName() + ": " + this.getNome());
    }

    public void fazSom() {
        super.fazSom();
        System.out.println("Roooooaaaarrrrrrrrrrrrr");
        super.fazOutroSom();
        System.out.println("Miau");
    }

}
