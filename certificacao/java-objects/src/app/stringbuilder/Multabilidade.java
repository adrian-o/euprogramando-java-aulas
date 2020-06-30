package app.stringbuilder;

public class Multabilidade {
    public static void main(String[] args) {
        
        // StringBuilder: "Eu programando nessa aula mais uma coisa pra finalizar"
        StringBuilder sb = new StringBuilder("Eu Programando");
        StringBuilder sb2 = sb.append(" nessa aula");
        sb.append(" mais uma coisa");
        sb.append(" e mais outra");
        sb2.append(" e mais uma pra finalizar");

        // "Eu programando"
        // "Eu programando nessa aula"
        // "Eu "
        // "Amando"
        String s1 = "Eu programando";
        String s2 = s1.concat(" nessa aula");
        s1.substring(0,2);
        s1.replace("Eu Progra", "A");

        System.out.println("#####################################");
        System.out.println("StringBuilder sb: " + sb);
        System.out.println("StringBuilder sb2: " + sb2);
        System.out.println("String s1: " + s1);
        System.out.println("String s2: " + s2);
    }
}