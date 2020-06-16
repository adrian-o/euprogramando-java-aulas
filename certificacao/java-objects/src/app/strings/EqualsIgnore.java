package app.strings;

public class EqualsIgnore {
    public static void main(String[] args) {
        String canal = "Adriano Ohana";
        String compara = "adrianoohana";

        System.out.println("Equals: " + canal.equals(compara));
        System.out.println("Equals ignoring case: " + 
                                canal.equalsIgnoreCase(compara));
    }
}