package app.classes.zoo;

public abstract class Animal {
    private String nome;
    private String codigo;
    protected boolean predador;
    Integer numeroPatas;

    public Animal(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void fazSom() {
        System.out.println("O som do " + getNome() + " é: ");
    }

    public void fazOutroSom() {
        System.out.println("O Outro som do " + getNome() + " é: ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isPredador() {
        return predador;
    }

    public void setPredador(boolean predador) {
        this.predador = predador;
    }

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(Integer numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
