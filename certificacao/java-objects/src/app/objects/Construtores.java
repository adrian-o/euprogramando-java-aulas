package app.objects;

public class Construtores {

    // Construtor válido
    /*Construtores() {System.out.println("Criando o Objeto.");}*/

    // Apenas um método comum
    void Construtores() {
        System.out.println("Chamando o método.");
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Construtores
        Construtores c = new Construtores();
        c.Construtores();
    }
}