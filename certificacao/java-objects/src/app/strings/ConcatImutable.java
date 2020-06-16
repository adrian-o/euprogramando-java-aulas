package app.strings;

public class ConcatImutable {
    public static void main(String[] args) {
        String s = "1";
        String s2 = "2";

        s.concat(s2);

        System.out.println("#################################");
        System.out.println("resultado = " + s + s2);
        System.out.println("s = " + s);
    }
}