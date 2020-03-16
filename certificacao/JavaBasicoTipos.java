public class JavaBasicoTipos {
    
    public Integer meuInteger = 2;
    public int meuInt = 3;

    public static void main(String[] args) {
        JavaBasicoTipos jbt = new JavaBasicoTipos();
        JavaBasicoTiposOutra jbto = new JavaBasicoTiposOutra();
        jbto.setIdade(36);
        String minhaMensagem = jbt.mensagem(jbto.getIdade());
        
        jbto.calculaIdade();

        System.out.println(minhaMensagem);
    }

    private String mensagem(int idade) {
        String innerMsg = "Meu nome é Adriano e eu sei somar " 
            + meuInteger + " + " + meuInt + " = 5 e eu tenho " 
            + idade + " anos de idade" ;

        return innerMsg;
    }

}