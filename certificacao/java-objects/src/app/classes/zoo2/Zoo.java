package app.classes.zoo2;

public class Zoo {
    public static void main(String[] args) {
        Animal c = new Cachorro("C001","Rex",false,4);
        c.cacar();

        Animal p = new Passarinho("P001","Frufru",false,2);
        p.cacar();

        Animal h = new Hiena("H002","Risadinha",true,4);
        h.cacar();

        Animal a = new Leopardo("L002","Carlito",true,4);
        a.cacar();
    }
}
