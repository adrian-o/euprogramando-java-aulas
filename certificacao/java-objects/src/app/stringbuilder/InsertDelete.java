package app.stringbuilder;

public class InsertDelete {
    public static void main(String[] args) {
        // Eu Programando -> Eu-Programando
        StringBuilder sb = new StringBuilder("Eu Programando");
        sb.insert(2,"-");
        sb.delete(3,4);

        System.out.println("###############################");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}