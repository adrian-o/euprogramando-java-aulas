package app.datas;

import java.time.LocalTime;

public class ManipulandoHoras {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.of(Integer.valueOf(args[0]), 0);
        System.out.println(hora);

        int dormir = Integer.valueOf(args[1]);
        int intervBeb = Integer.valueOf(args[2]);

        while(hora.getHour() > 0 && hora.getHour() < dormir) {
            System.out.println("Beba águas as " + hora + " horas...");
            hora = hora.plusHours(intervBeb);
        }

        System.out.println(hora.minusNanos(1));
    }
}
