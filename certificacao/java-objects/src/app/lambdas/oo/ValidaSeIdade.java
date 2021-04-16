package app.lambdas.oo;

public class ValidaSeIdade implements Validador{

    @Override
    public boolean valida(Aluno a) {
        return a.getIdade() <= 12 && a.getNota() >= 7.0;
    }
}
