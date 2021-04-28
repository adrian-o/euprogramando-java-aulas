package app.lambdas.predicates;

public class Professor {
    private String nome;
    private String materia;
    private Integer idade;

    public Professor(String nome, String materia, Integer idade) {
        this.nome = nome;
        this.materia = materia;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
