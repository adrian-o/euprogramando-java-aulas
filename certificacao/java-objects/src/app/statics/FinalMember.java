package app.statics;

public final class FinalMember {
    public final int INSERIDO = 1;
    public final int PROCESSADO = 2;

    public final void meuMetodo(final int number) {
        final int number2;
        if (number == 0) {
            number2 = 8;
        } else {
            number2 = 9;
        }
        System.out.println("Number2 = " + number2);
    }

    public static void main(String[] args) {
        FinalMember fm = new FinalMember();
        fm.meuMetodo(5);
    }
}
