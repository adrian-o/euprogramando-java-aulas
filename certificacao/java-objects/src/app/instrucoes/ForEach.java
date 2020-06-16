package app.instrucoes;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    
    public static void main(String[] args) {
        String[] frase = {"Pessoal","muito","obrigado", "por", "acompanharem", "o","canal"};
        
        List<String> fraseList = Arrays.asList(frase);

        System.out.println("...Iterando sobre os valores da lista ForEach...");
        for ( String item : fraseList ) {
            System.out.println("Item: " + item);
        }

        System.out.println("");
        System.out.println("...Iterando sobre os valores da lista Iterator...");
        for ( java.util.Iterator<String> item = fraseList.iterator() ; item.hasNext() ; ) {
            String it = item.next();
            System.out.println("Item: " + it);
        }
    }
}