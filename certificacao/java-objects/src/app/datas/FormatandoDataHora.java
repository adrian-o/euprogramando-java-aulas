package app.datas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatandoDataHora {
    public static void main(String[] args) {
        System.out.println("\n#### Formatando Data/Hora #####");
        DateTimeFormatter mediumDtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("SHORT -> " + mediumDtf.format(LocalDateTime.now()));

        DateTimeFormatter shortDtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("SHORT -> " + shortDtf.format(LocalDateTime.now()));
    }
}
