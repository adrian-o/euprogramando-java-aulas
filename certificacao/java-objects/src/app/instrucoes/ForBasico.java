package app.instrucoes;

public class ForBasico {
    
    public static void main(String[] args) {

        String[] frase = {"0","1","2", "3", "4", "5","6", "7", "8", "9"};
        
        // 1 - inicialização 1 vez
        // 2 - condição que ocorre toda iteração
        // 3 - executa o bloco de código dentro das chaves
        // 4 - executa a atualização
        // volta para o item 2
        for (int i = 0, x = 0 ; i < frase.length  ; i++ ) {
            System.out.println("Valor do Arg [" + i + "]: " + frase[i]);
        }

        // Demais  regras do FOR
        // - Cuidado para não redeclarar variáveis e se confundir
        // - Cuidado para não declarar tipos diferentes na inicialização
        // - Cuidado com o escopo das suas variáveis no bloco
        // long x = 0;
        for ( int i = 0, x = 0; i < 10  ; i++ ) {
            x = 2;
        }
    }
}