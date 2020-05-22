package app.topicos;

import java.util.Date;

public class Identificadores {

    // regras
    // 1- Deve começar com uma letra, $ ou _
    // 2- Após o primeiro caractere pode receber números 
    // mas não caracterres especiais como @, #, (), *, &, etc.
    // 3- Você não pode usar o mesmo nome de uma palavra 
    // chave reservada
    int teste;
    float $teste;
    boolean _teste;
    String main;

    Date hoje;

    public Identificadores() {

    }

    public static void main(String[] args) {
        Identificadores meuIdent = new Identificadores();
        System.out.println("valor int: " + meuIdent.teste);
        System.out.println("valor float: " + meuIdent.$teste);
        System.out.println("valor boolean: " + meuIdent._teste);
        System.out.println("valor String: " + meuIdent.main);
        System.out.println("valor Date: " + meuIdent.hoje);
    }

    // protected void finalize() {
    //     System.out.println("Finalizando o objeto Identificadores");
    // }
}