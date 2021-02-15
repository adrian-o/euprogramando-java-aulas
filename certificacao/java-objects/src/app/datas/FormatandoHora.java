package app.datas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatandoHora {
    public static void main(String[] args) {
        System.out.println("\n#### Formatando Horas #####");
        DateTimeFormatter mediumTf = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println("MEDIUM -> " + mediumTf.format(LocalTime.now()));

        DateTimeFormatter shortTf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("SHORT -> " + shortTf.format(LocalTime.now()));
    }
}
