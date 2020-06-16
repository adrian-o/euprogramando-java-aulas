package app.strings;

public class Substrings {
    public static void main(String[] args) {
        String canal = "Eu Programando";

        System.out.println("###########################################");
        System.out.println(canal.substring(3));
        System.out.println(canal.substring(3, canal.length()));
        System.out.println(canal);
        System.out.println(canal.substring(-1));
    }
}