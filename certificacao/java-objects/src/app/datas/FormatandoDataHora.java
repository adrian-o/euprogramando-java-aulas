package app.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatandoDataHora {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.of(2019, 12, 21, 8, 46, 22);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println("Formatada: " + dtf.format(data));
        System.out.println("Data: " + data);
    }
}
