package app.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatandoData {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2019,12,21);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM;yyyy;dd"); // DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        System.out.println("Formatada: " + dtf.format(data));
        System.out.println("Data: " + data);
    }
}
