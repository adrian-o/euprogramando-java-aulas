package app.datas;

import java.time.LocalDate;

public class ManipulandoDatas {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        for (int i = 0; i<3; i++) {
            System.out.println("A parcela " + (i+1) + " vence no dia " + data.plusMonths(i+1));
        }

        System.out.println(data + " " +data.getDayOfWeek());
        data = data.plusWeeks(1);
        System.out.println(data + " " +data.getDayOfWeek());

//        LocalDate data = LocalDate.now();
        System.out.println(data.plusWeeks(1));
        data = data.plusWeeks(1);
        System.out.println(data);
    }
}
