package app.stringbuilder;

public class DemaisMetodos {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Eu Programando");

        System.out.println("#############################");
        System.out.println(sb.substring(8,14));
        System.out.println(sb.charAt(3));
        System.out.println(sb.replace(0, 8, ""));
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(3));

        System.out.println("sb = " + sb);
    }
}