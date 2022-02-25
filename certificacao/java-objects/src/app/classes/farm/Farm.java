package app.classes.farm;

public class Farm {
    public static void main(String[] args) {
        FarmAnimal chicken = new Chicken();
        chicken.setNome("Magricela");
        chicken.setNumeroPatas(2);

        System.out.println("A " + chicken.getNome() + " possui " + chicken.getNumeroPatas() + " patas");
        chicken.wakeUp();
    }
}
