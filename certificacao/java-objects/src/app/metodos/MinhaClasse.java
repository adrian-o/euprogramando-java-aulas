package app.metodos;

public class MinhaClasse {

    int numero;
    String cor;

    public MinhaClasse(int numero, String cor) {
        this.numero = numero;
        this.cor = cor;
    }

    public static void main(String[] args) {
        MinhaClasse mc = new MinhaClasse(10,"Branca");
        System.out.println("Valores - > " + mc.numero + " " + mc.cor);
    }
}
