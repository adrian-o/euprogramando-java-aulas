package app.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatandoData {
    public static void main(String[] args) {
        System.out.println("\n#### Formatando Datas #####");
        DateTimeFormatter fullDf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("FULL -> " + fullDf.format(LocalDate.now()));

        DateTimeFormatter longDf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("LONG -> " + longDf.format(LocalDate.now()));

        DateTimeFormatter mediumDf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("MEDIUM -> " + mediumDf.format(LocalDate.now()));

        DateTimeFormatter shortDf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("SHORT -> " + shortDf.format(LocalDate.now()));
    }
}
