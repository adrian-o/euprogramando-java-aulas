package app.objects;

public class CamposEBlocos {
    // 1
    static String var1 = "abc";
    static String var2 = "def";
    static String res = var1 + var2;

    // 2
    {
        System.out.println("Resultado: " + res);
        res = res + " BLOCO";
    }

    // 3
    CamposEBlocos(){
        System.out.println("Resultado: " + res);
        res = res + " e CONSTRUTOR";
    }

    public static void main(String[] args) {
        new CamposEBlocos();
        System.out.println("Resultado: " + res);
    }
}

// Resultado: abcdef
// Resultado: abcdef BLOCO
// Resultado: abcdef BLOCO e CONSTRUTOR