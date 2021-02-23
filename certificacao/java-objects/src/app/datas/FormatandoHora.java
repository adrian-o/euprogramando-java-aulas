package app.datas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatandoHora {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.of(10,15,43);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(hora);
        System.out.println(dtf.format(hora));
    }
}
