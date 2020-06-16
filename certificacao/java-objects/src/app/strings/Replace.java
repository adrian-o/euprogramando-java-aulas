package app.strings;

public class Replace {
    public static void main(String[] args) {
        String canal = "Eu Programando a todo vaPor";

        System.out.println("###############################################");
        System.out.println(canal.replace('P', 'p'));
        System.out.println(canal.replace('a', '@'));
        System.out.println(canal.replace("Programando", ""));
        System.out.println(canal);

    }
}