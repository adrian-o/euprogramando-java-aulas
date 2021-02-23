package app.metodos;

public class DesenhoDeMetodos {
    public static void main(String[] args) throws Exception {
        meuMetodo4("");
    }

    // Modificador: public
    // Acessor específico: static / final / abstract
    // Tipo de retorno: String
    // Nome: meuMetodo
    // Lista de par.: String str
    // Declaração de exception: throws Exception
    // Corpo: {...}
    public static String meuMetodo(String str) { //throws Exception {
        return "1 " + str;
    }

    protected static String meuMetodo2(String str) { //throws Exception {
        return "2 " + str;
    }

    static String meuMetodo3(String str) { //throws Exception {
        return "3 " + str;
    }

    private static String meuMetodo4(String str) { //throws Exception {
        return "4 " + str;
    }

}
