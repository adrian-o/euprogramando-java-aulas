package app.classes.zoo2;

public abstract class Animal {
    private String nome;
    private String codigo;
    protected boolean predador;
    protected Integer numeroPatas;

    public Animal(String codigo, String nome, boolean predador, Integer numeroPatas) {
        this.codigo = codigo;
        this.nome = nome;
        this.predador = predador;
        this.numeroPatas = numeroPatas;
    }

    public void locomover() {
        System.out.println("O Animal se move...");
    }

    protected final void cacarPrivado() {
        System.out.println("O Animal caça escondido...");
    }

    public void cacar() {
        if (predador && numeroPatas > 2) {
            System.out.println(this.getClass().getSimpleName() + " é um caçador...");
            return;
        }
        System.out.println(this.getClass().getSimpleName() + " NÃO é um caçador...");
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
