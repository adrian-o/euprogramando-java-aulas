package app.classes.zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal c = new Cachorro();
        c.setCodigo("C001");
        c.setNome("Rex");

        Animal c2 = new Cachorro();
        c2.setCodigo("C002");
        c2.setNome("Totó");
        System.out.println("Cachorro: " + c2.getNome());
        c2.fazSom();

        Animal l = new Leopardo();
        l.setCodigo("L001");
        l.setNome("Mimo");

        Animal p = new Passarinho();
        p.setCodigo("P001");
        p.setNome("Frufru");
        System.out.println("Passarinho: " + p.getNome());
        p.fazSom();

        Leopardo a = new Leopardo();
        a.setCodigo("L002");
        a.setNome("Carlito");
        a.setPredador(true);
        a.setNumeroPatas(4);
        System.out.println("Leopardo: " + a.getNome());
        a.fazSom();
        a.cacar();


//        System.out.println("Cachorro: " + c.getNome());
//        System.out.println("Cachorro: " + c2.getNome());
//        System.out.println("Leopardo: " + l.getNome());
//        System.out.println("Passarinho: " + p.getNome());
//
//        System.out.println("Leopardo: " + a.getNome());
    }
}
