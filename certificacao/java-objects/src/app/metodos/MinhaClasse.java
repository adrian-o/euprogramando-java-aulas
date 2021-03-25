package app.metodos;

public class MinhaClasse {

    int numero;
    String cor;

    public MinhaClasse() {
        // new MinhaClasse(99, "Preta");
        this(99, "Preta");
    }

    public MinhaClasse(int numero) {
        this(numero, "Preta");
    }

//    public int MinhaClasse(int number) {
//        return 0;
//    }

    public MinhaClasse(String cor) {
        this(99, cor);
    }

    public MinhaClasse(int numero, String cor) {
        this.numero = numero;
        this.cor = cor;
    }

    public static void main(String[] args) {
        MinhaClasse mc = new MinhaClasse();
        System.out.println("Valores - > " + mc.numero + " " + mc.cor);
    }
}
