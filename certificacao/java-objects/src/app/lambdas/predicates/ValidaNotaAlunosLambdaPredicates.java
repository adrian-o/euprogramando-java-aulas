package app.lambdas.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ValidaNotaAlunosLambdaPredicates {
    public static void main(String[] args) throws InterruptedException {
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

        System.out.println("Valida alunos maiores que 12 anos tiram nota na média...");
        valida(alunos, a -> a.getNota()>=7.0 && a.getIdade()<=12);

        alunos.removeIf(a->a.getNota()<7.0);

        System.out.println("Alunos na média...");
        alunos.forEach(a-> System.out.println(a.getNome()));

        List<Professor> profs = new ArrayList<>();
        profs.add(new Professor("Adriano","Programação",38));
        profs.add(new Professor("João","Geografia", 50));

        System.out.println("Valida professores novos e enxutos..");
        validaProf(profs, p -> p.getIdade()<40);

        List<String> nomes = new ArrayList<>();
        nomes.add("José");
        nomes.add("Ana");
        nomes.add("Felipe");
        nomes.add("Marcelo");
        nomes.add("André");
        nomes.add("Carlos");
        nomes.add("Pedro");

        System.out.println("Todos os nomes...");
        for (String n : nomes) System.out.println(n);

        nomes.removeIf(n -> n.charAt(0)=='A');

        System.out.println("Nomes sem A...");
        for (String n : nomes) System.out.println(n);
    }

    private static void valida(List<Aluno> alunos, Predicate<Aluno> validador) {
        for (Aluno a : alunos) {
            if (validador.test(a)) {
                System.out.println("Aluno validado: " + a.getNome() + " -> " + a.getNota());
            }
        }
    }

    private static void validaProf(List<Professor> profs, Predicate<Professor> validador) {
        for (Professor p : profs) {
            if (validador.test(p)) {
                System.out.println("Prof validado: " + p.getNome());
            }
        }
    }
}
