package app.operadores;

public class Ternarios {
    public static void main(String[] args) {
        int idade = 17;
        String maioridade = ((idade >= 18) ? "de maior" : "de menor");
        System.out.println("O cidadão é " + maioridade);
    }
}