package app.strings;

public class Contains {
    public static void main(String[] args) {
        String canal = "Eu Programando ";

        System.out.println("#################################");
        System.out.println(canal.contains("P"));
        System.out.println(canal.contains("p"));
        System.out.println(canal.contains("Programa"));
        System.out.println(canal.contains("amando"));
        System.out.println(canal.contains("eu"));
        System.out.println(canal.contains(" "));
        System.out.println(canal.contains("  "));
        System.out.println(canal);
    }
}