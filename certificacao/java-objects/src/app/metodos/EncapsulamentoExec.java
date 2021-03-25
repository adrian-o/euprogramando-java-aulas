package app.metodos;

public class EncapsulamentoExec {
    public static void main(String[] args) {
        Encapsulamento enc = new Encapsulamento();
        enc.setIdade(15);
        enc.setAltera(false);
        enc.dobraIdade();
        System.out.println("É pra alterar? " + enc.isAltera());
        System.out.println("Idade em dobro: " + enc.getIdade());
    }
}
