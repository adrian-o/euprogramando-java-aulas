package app.stringbuilder;

public class Igualdade {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Eu Programando");
        StringBuilder canal = sb;
        
        System.out.println("#####################################");
        System.out.println(sb == canal);
        System.out.println(sb.toString().equals(canal.toString()));

        System.out.println((new Igualdade()).toString());
    }

    @Override
    public String toString() {
        return "Para vocês verem que funciona...";
    }
}