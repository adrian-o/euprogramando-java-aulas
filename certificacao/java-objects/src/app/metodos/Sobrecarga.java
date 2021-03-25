package app.metodos;

public class Sobrecarga {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("");

        Sobrecarga sob = new Sobrecarga();
        sob.meuMetodo(Integer.valueOf(1));
    }

    // 1
    public void meuMetodo() {}

    // 2
    public void meuMetodo(int i) {
        System.out.println("Inteiro");
    }

    // 3
    public void meuMetodo(byte i) {
        System.out.println("Byte");
    }

    // 4
    public void meuMetodo(long i) {
        System.out.println("Long");
    }

    // 5
    public void meuMetodo(Integer i) {
        System.out.println("Integer");
    }

    public void meuMetodo(int i, String s) {}

    public void meuMetodo(String s, int i) {}

    public void meuMetodo(Sobrecarga s) {}
}
