package app.tipos;

public class Referencias {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.numero = "123-1";
        
        Cliente cliente = new Cliente();
        cliente.nome = "Adriano";
        cliente.recebeConta(conta);
        
        System.out.println("Objeto conta: " + conta);
        System.out.println("Objeto Conta do cliente: " + cliente.cont);
        System.out.println("Num Conta do cliente: " + cliente.cont.numero);
        
        conta.numero = "124-b";

        System.out.println("Num Conta do cliente: " + cliente.cont.numero);

        cliente.cont.numero = "9999-0";
        System.out.println("Mudando novamente a conta do cliente: " + conta.numero);
    }
}

class Conta {
    public String numero;
}

class Cliente {
    public String nome;
    public Conta cont;

    void recebeConta(Conta c){
        cont = c;
    }
 }