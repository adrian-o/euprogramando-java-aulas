public class JavaBasico {
    
    // Modificadores de acesso: public, default, protected, private
    // Tipos: primitivos (int, float, char, boolean), wrappers (Integer, Double, Float), instância/objeto (String)
    
    // Escopo: classe/objeto/instância - São chamadas de atributos
    public int var1 = 1;
    public Integer var2 = 2;

    public static void main(String[] args) {
        JavaBasico jb = new JavaBasico();
        jb.main2();
        jb.main3();
    } 


    public void main2() {
        int var4 = 4;

        System.out.println(var4); 
    }


    public void main3() {
        int var4 = 6;
        int var5 = 5;
        
        if (var5 == 5) {
            //int var6 = 6;
            //int var7 = 7;
        }

        System.out.println(var4 + var1); 
        System.out.println(var5 + var4 + var2); 
    }
}