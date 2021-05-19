package app.classes.zoo2;

public class Passarinho extends Animal {
    public Passarinho(String codigo, String nome, boolean predador, Integer numeroPatas) {
        super(codigo, nome, predador, numeroPatas);
        System.out.println(this.getClass().getSimpleName() + ": " + this.getNome());
    }

    public void fazSom() {
        super.fazSom();
        System.out.println("Piu piu");
        super.fazOutroSom();
        System.out.println("--");
    }
}
