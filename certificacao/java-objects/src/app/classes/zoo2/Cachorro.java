package app.classes.zoo2;

public class Cachorro extends Animal {
    public Cachorro(String codigo, String nome, boolean predador, Integer numeroPatas) {
        super(codigo, nome, predador, numeroPatas);
        System.out.println(this.getClass().getSimpleName() + ": " + this.getNome());
    }

    public void fazSom() {
        super.fazSom();
        System.out.println("Au au");
        super.fazOutroSom();
        System.out.println("--");
    }
}
