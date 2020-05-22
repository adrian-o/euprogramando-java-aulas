package app.operadores;

public class Logicos {
    public static void main(String[] args) {
        // & e - and - true e true
        // &&

        // | ou - or - true e true / true e false / false e true
        // ||

        // ^ xor - true e false / false e true

        int idade = 17;
        int altura = 155;

        if ( validaIdade(idade)  ^  validaAltura(altura) ) {
            System.out.println("Entrada permitida no brinquedo...");
        } else {
            System.out.println("Entrada proibida no brinquedo...");
        }
    }

    static boolean validaIdade(int idade) {
        System.out.println("Validando a idade da pessoa...");
        return (idade >= 18); 
    }

    static boolean validaAltura(int altura) {
        System.out.println("Validando a altura da pessoa...");
        return (altura >= 160); 
    }
}