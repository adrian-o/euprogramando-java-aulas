package app.lambdas;

public class Aluno {
    private String nome;
    private Integer idade;
    private String cadeira;
    private Double nota;

    public Aluno(String nome, Integer idade, String cadeira, Double nota) {
        this.nome = nome;
        this.idade = idade;
        this.cadeira = cadeira;
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }
}
