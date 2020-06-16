package app.strings;

public class StartsEndsWith {
    public static void main(String[] args) {
        String canal = "eu programando";

        System.out.println("#########################################");
        System.out.println("Starts " + canal.startsWith("eu prog"));
        System.out.println("Ends " + canal.endsWith("Programando"));

        if (canal.startsWith("eu prog")) {
            System.out.println("Ajuste o nome do canal pra usar maiúsculas.");
        }
    }
}