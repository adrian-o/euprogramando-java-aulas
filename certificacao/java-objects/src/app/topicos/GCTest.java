package app.topicos;

public class GCTest {
    public static void main(String[] args) {
        Qualquer q = new Qualquer();
        new Qualquer();
        novoObjeto(q);
        System.out.println("Finalizando o método");
    }

// Quantos objetos estão elegíveis para o Garbage Collector 
// na linha 8?

    static void novoObjeto(Qualquer q) {
        q = new Qualquer();
    }
}

class Qualquer {

}