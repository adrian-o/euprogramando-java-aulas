package app.classes.zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal c = new Cachorro();
        c.setCodigo("C001");
        c.setNome("Rex");

        Animal c2 = new Cachorro();
        c2.setCodigo("C002");
        c2.setNome("Totó");

        Animal l = new Leopardo();
        l.setCodigo("L001");
        l.setNome("Mimo");

        Animal p = new Passarinho();
        p.setCodigo("P001");
        p.setNome("Frufru");

        Animal a = new Leopardo();
        a.setCodigo("L002");
        a.setNome("Carlito");

        System.out.println("Cachorro: " + c.getNome());
        System.out.println("Cachorro: " + c2.getNome());
        System.out.println("Leopardo: " + l.getNome());
        System.out.println("Passarinho: " + p.getNome());

        System.out.println("Leopardo: " + a.getNome());
    }
}
