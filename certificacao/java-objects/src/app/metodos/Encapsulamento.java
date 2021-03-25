package app.metodos;

public class Encapsulamento {

    private Integer idade;

    private boolean altera;

    public void setIdade(Integer idade) {
        this.idade = idade;

        if (idade < 0) {
            this.idade = 0;
        }
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setAltera(boolean altera) {
        this.altera = altera;
    }

    public boolean isAltera() {
        return this.altera;
    }

    public void dobraIdade() {
        if (isAltera())
            this.idade = this.idade * 2;
    }
}
