package app.testes;

public class Teste {
    public static void main(String[] args) {
        Carro criaCarro = new Carro("FIAT");
        Casa casa = new Casa(criaCarro, "CG");

        System.out.println(casa.carro.marca);
        criaCarro.marca = "FORD";
        System.out.println(casa.carro.marca);
    }
}

class Casa {
    public Carro carro;
    public String moto;

    public Casa(Carro carro, String moto) {
        this.carro = carro;
        this.moto = moto;
    }
}

class Carro {
    public String marca;

    public Carro(String marca) {
        this.marca = marca;
    }
}
