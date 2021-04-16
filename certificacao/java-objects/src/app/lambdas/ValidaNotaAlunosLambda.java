package app.lambdas;

import app.lambdas.oo.Aluno;
import app.lambdas.oo.Validador;

import java.util.ArrayList;
import java.util.List;

public class ValidaNotaAlunosLambda {
    public static void main(String[] args) {
        List<Aluno> alunos  = new ArrayList<>();
        alunos.add(new Aluno("Joaquim", 13, "FUNDO", 7.0));
        alunos.add(new Aluno("Caio", 14, "FUNDO", 6.5));
        alunos.add(new Aluno("Marlene", 13, "FUNDO",8.0));
        alunos.add(new Aluno("Victor", 14, "MEIO", 5.0));
        alunos.add(new Aluno("Valentina", 12, "FRENTE", 7.0));
        alunos.add(new Aluno("Pedro Augusto", 14, "FRENTE", 10.0));
        alunos.add(new Aluno("Pedro Henrique", 11, "FRENTE", 10.0));

        alunos.add(new Aluno("Manoel", 15, "MEIO", 7.1));
        alunos.add(new Aluno("Joel", 17, "FRENTE", 5.0));
        alunos.add(new Aluno("Marcos", 21, "FUNDO", 6.9));

        System.out.println("Validando se somente alunos maiores que 12 anos tiram nota da média...");
        valida(alunos, a -> a.getNota()>=7.0 && a.getIdade()<=12);

        //valida(alunos, a -> new ValidadorConcreto() { boolean valida(Aluno a) { return getNota()>=7.0 && a.getIdade()<=12} });

        System.out.println("Validando se somente alunos que não sentam no FUNDO da sala tiram nota da média...");
        valida(alunos, a -> a.getNota()>=7.0 && a.getCadeira().equals("FUNDO"));

        System.out.println("Alunos mnaiores de 14 que não sentam na FRENTE e NÃO tiram nota na média...");
        valida(alunos, a -> a.getNota()<=7.0 && !a.getCadeira().equals("FRENTE") && a.getIdade()>=15);
    }

    private static void valida(List<Aluno> alunos, Validador validador) {
        for (Aluno a : alunos) {
            if (validador.valida(a)) {
                System.out.println("Aluno validado: " + a.getNome() + " -> " + a.getNota());
            }
        }
    }
}
