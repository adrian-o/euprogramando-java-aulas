package app.live;

public class Duvidas0116 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();

        o3 = o2;
        o2 = null;

        o4.toString();
    }

    public enum TesteEnum {
        TESTE;   
    }

    public static String nome;
}