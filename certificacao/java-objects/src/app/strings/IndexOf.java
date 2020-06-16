package app.strings;

public class IndexOf {
    public static void main(String[] args) {
        String nome = "Eu@Programando";

        // prog é diferente de Prog que é diferente de PROG

        System.out.println("#########################################");
        System.out.println(nome.indexOf("Prog"));
        System.out.println(nome.indexOf("and", 3));
        System.out.println(nome.indexOf(64));
        System.out.println(nome.indexOf('g', 4));
    }
}