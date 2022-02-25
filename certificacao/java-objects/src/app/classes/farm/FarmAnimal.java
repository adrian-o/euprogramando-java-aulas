package app.classes.farm;

public abstract class FarmAnimal {
    protected String nome;
    protected Integer numeroPatas;

    protected abstract void wakeUp();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(Integer numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
