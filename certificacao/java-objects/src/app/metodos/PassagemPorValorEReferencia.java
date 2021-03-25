package app.metodos;

public class PassagemPorValorEReferencia {

    int referencia = 9;

    public static void main(String[] args) {
        PassagemPorValorEReferencia pvr = new PassagemPorValorEReferencia();
        pvr.referencia = 10;
        int valor = 9;
        pvr.passagemValor(valor);
        pvr.passagemReferencia(pvr);
        System.out.println("Valor é " + valor);
        System.out.println("Referência é " + pvr.referencia);
    }

    public void passagemValor(int valor) {
        valor = 10;
    }

    public void passagemReferencia(PassagemPorValorEReferencia pvr) {
        pvr.referencia = 11;
    }
}
