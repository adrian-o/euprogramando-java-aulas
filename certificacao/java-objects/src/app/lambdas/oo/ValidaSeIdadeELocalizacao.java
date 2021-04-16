package app.lambdas.oo;

public class ValidaSeIdadeELocalizacao implements Validador {
    @Override
    public boolean valida(Aluno a) {
        return a.getIdade() >= 15 && !a.getCadeira().equals("FRENTE") && a.getNota() <=7.0;
    }
}
