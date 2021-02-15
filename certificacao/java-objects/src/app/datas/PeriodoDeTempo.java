package app.datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class PeriodoDeTempo {
    public static void main(String[] args) {
        LocalDate data1Evento = LocalDate.now();
        LocalDate dataUltEvento = LocalDate.of(2025, Month.DECEMBER, 31);

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga qual é o período do evento Y/M/S/D");
        String periodo = sc.next();

        System.out.println("Quantidade do período");
        int qtPer = sc.nextInt();

        Period period = periodo.equals("Y") ? Period.ofYears(qtPer) :
                (periodo.equals("M") ? Period.ofMonths(qtPer) :
                (periodo.equals("S") ? Period.ofWeeks(qtPer) :
                (periodo.equals("D") ? Period.ofDays(qtPer) : null)));

        // Period period = Period.of(1, 0, 1);

        while (data1Evento.plus(period).isBefore(dataUltEvento)) {
            data1Evento = data1Evento.plus(period);
            System.out.println(data1Evento);
        }
    }
}
