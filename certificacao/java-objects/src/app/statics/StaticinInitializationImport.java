package app.statics;

import static app.metodos.StaticClass.meuMetodo;

public class StaticinInitializationImport {
    public static int variavel = 1;

    public StaticinInitializationImport() {
        variavel = 2;
        System.out.println("Construtor " + variavel);
    }

    {
        variavel = 3;
        System.out.println("Bloco de inicialização " + variavel);
    }

    static {
        variavel = 4;
        System.out.println("Bloco estático " + variavel);
    }

    public static void main(String[] args) {
        new StaticinInitializationImport();
        variavel = 5;
        System.out.println("Método main " + variavel);

        meuMetodo();
    }
}
