package app.metodos;

public class Varargs {

    // VarArg : Variable + Arguments
    public static void main(String[] args) {
        meuMetodo(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        meuMetodo(1, new int[]{2, 3, 4, 5, 6, 7, 8});
        meuMetodo(1,12, 41, 28, 345, 6);
        meuMetodo(0, new int[]{}); // IndexOutOfBound
        meuMetodo(0, null); // NullPointer
    }

    // x, y, ... {1,2,3,4,5,6,7,8,9}
    // x, ..., y, ..., j

    // Sempre que vc usar vararg, o vararg deve ser o ultimo parâmetro do seu metodo.
    static void meuMetodo(int indice, int... meuArray) {
        for (int item : meuArray) {
            System.out.println("Item: " + item);
        }
        System.out.println("Indice escolhido: " + meuArray[indice]);
        System.out.println("#####################################################");
    }

//    static void meuMetodo2(int... vararg1){}
//    static void meuMetodo2(int... vararg1, int i){} // Não compila
//    static void meuMetodo3(int i, int j, int x, int... vararg1){}
//    static void meuMetodo4(int ...var1, int ...var2){} // Não compila
}
