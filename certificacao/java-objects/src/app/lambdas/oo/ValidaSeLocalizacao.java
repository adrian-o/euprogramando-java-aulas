package app.lambdas.oo;

public class ValidaSeLocalizacao implements Validador {

    @Override
    public boolean valida(Aluno a) {
        return a.getCadeira().equals("FUNDO") && a.getNota() >= 7.0;
    }
}
