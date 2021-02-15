package app.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ApiDeData {

    public ApiDeData(int i) {}

    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());

        // Métodos de criação de datas e hora
        // new LocalDate() LocalTime() LocalDateTime() dará um erro de compilação
        // LocalDateTime.of(2020, Month.FEBRUARY, 30, 10, 25) -> java.time.DateTimeException em tempo de execução


        LocalDate ld = LocalDate.of(2020, 4, 1);
        ld = LocalDate.of(2021, Month.APRIL, 30);
        System.out.println(ld);

        System.out.println(LocalTime.of(0,0));
        System.out.println(LocalTime.of(18,10, 20));
        System.out.println(LocalTime.of(18,25, 40, 561));

        LocalTime lt = LocalTime.of(18,10, 20);

        System.out.println(LocalDateTime.of(ld, lt));
        System.out.println(LocalDateTime.of(2020, Month.FEBRUARY, 30, 10, 25));
    }
}
