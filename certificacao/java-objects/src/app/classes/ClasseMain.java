package app.classes;

public class ClasseMain {

    public static void main(String[] args) {
        MinhaClasseImutavel mci = new MinhaClasseImutavel(new StringBuilder("Adriano"));
        System.out.println(mci.getNome().toString());
//        System.out.println((new MinhaClasseImutavel("Eu Programando")).getNome());
        StringBuilder novoSb = mci.getNome().append(" Ohana");
        System.out.println(novoSb.toString());

        System.out.println(mci.getNome().toString());
    }
}
