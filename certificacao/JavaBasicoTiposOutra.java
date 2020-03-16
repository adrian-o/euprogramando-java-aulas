public class JavaBasicoTiposOutra {
    
    private int idade;

    public JavaBasicoTiposOutra() {
    }

    private int calculaIdade() {
        // ...
        return 0;
    }

    public void setIdade(int idade) {
        if (idade < 1) {
            System.out.println("Idade inválida...");
        } else if (idade < 18) {
            System.out.println("Programa inadequado para menores...");
        }
        
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}