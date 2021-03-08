package app.metodos;

public class ExcecoesECorpoDoMetodo {
    public static void main(String[] args) {
        meuMetodo3(0);
    }
    // Excecoes
    // throws é obrigatoriamente a primeira palavra
    // Se houver mais de uma exceção, elas são obrigatoriamente separadas por virgula
    void meuMetodo() throws IllegalArgumentException, Exception {
        // ...
    }

    void meuMetodo2() {

    }

    static int meuMetodo3(int i) {
        System.out.println("Olá");
        if (i == 0) {
            System.out.println(" você não passou parametro válido");
            return i;
        }
        System.out.println("Ok");

        return 99;
    }
}
