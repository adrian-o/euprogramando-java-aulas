public class MetodoMain {

    /* SIM
    public static void main(String[] args) {
      System.out.println("Validei...");  
    }*/

    /* SIM
    static public void main(String[] args) {
        System.out.println("Validei...");  
    }*/

    /* SIM
    public static void main(String []args) {
        System.out.println("Validei...");  
    }*/

    /* SIM
    public static void main(String args[]) {
        System.out.println("Validei...");  
    }*/

    /* NAO COMPILA
    public void static main(String[] args) {
        System.out.println("Validei...");  
    }*/

    /* NAO E MAIN
    static void main(String[] args) {
        System.out.println("Validei...");  
    }*/

    /* NAO E MAIN
    public static void main(String args) {
        System.out.println("Validei...");  
    }*/

    /* NAO E MAIN
    public static void main(Integer[] args) {
        System.out.println("Validei...");  
    }*/



    /* SIM */
    public static void main(String[] args) {
      for (String arg : args)
        System.out.println("Validei... " + arg);  
    }
}