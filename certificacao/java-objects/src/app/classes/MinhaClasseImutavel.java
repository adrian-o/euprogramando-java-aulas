package app.classes;

public class MinhaClasseImutavel {

    public MinhaClasseImutavel(StringBuilder nome) {
        this.nome = nome;
    }

    private StringBuilder nome;

    public StringBuilder getNome() {
        return new StringBuilder(nome);
    }
}
