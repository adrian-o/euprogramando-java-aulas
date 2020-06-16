package app.strings;

public class LengthCharAt {
    public static void main(String[] args) {
        String nome = "Adriano Ohana7";
        int id = 13;

        int numCli = Integer.parseInt(""+nome.charAt(nome.length() - 1));

        System.out.println("Cliente de número: " + numCli);
        System.out.println(nome.length());
        System.out.println("Busca o id " + id + " = " + nome.charAt(id));
    }
}