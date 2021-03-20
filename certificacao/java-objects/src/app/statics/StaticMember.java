package app.statics;

public class StaticMember {
    public static int numero;

    public static void meuNumero() {
        System.out.println("Meu número " + numero);
    }

    public static void main(String[] args) {
        StaticMember.numero = 100;
        StaticMember.meuNumero();

        StaticMember sm = new StaticMember();
        StaticMember sm2 = new StaticMember();

        sm.numero = 5;
        sm2.numero = 44;

        StaticMember.meuNumero();
    }
}
