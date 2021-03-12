package app.metodos;

public class NomeListaParametros {
    // letras / numeros / $ _ / nao pode ter um numero na primeira posição do nome

    void meuMetodo() {}

    void meuMetodo1() {}

    void m1euMetodo() {}

    void Meumetodo() {} // Atenção a convenção

    void meu$Metodo$() {}

    void $meuMetodo$() {}

    void meu_Metodo() {}

    void _meuMetodo() {}

    // void 1meuMetodo() {} NÃO COMPILA

    // void meuMetodo&() {} NÃO COMPILA

    void parametros() {} // Lista de par vazia

    void parametros(Object o$) {} // Método com apenas um parâmetro

    void parametros(int i, Object o) {} // Mét com mais de um parâmetro, usa-se obrig vírgula "," para separar os pars

    // void parametros(int i; Object o) {} NÃO COMPILA

    // void parametros(int i | Object o) {} NÃO COMPILA

    void parametros(int...i) {}

    void parametros(int z, int...i) {}

    // void parametros(int...i, int z) {} NÃO COMPILA porque o varargs deve sempre ser o ultimo parâmetro.

    public void nomeDoMetodo() {}

    public int nomeDoMetodo(int i) {
        return 0;
    }

    // public int nomeDoMetodo() {} Não compila porque a lista de parâmetros não mudou embora tenhamos mudado o retorno pra INT

    // private void nomeDoMetodo() {} Não compila porque a lista de parâmetros não mudou embora tenhamos mudado o método pra PRIVATE

}
