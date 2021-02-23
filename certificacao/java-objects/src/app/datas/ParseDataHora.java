package app.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDataHora {
    public static void main(String[] args) {
        String dtPub = "27 de Abril de 2014";
        String[] arrData = dtPub.split(" de ");

        Locale loc = new Locale("pt","BR");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy", loc);

        String dataStr = (arrData[0] + " " + arrData[1] + " " + arrData[2]);

        LocalDate data = LocalDate.parse(dataStr, dtf);

        System.out.println(data.plusDays(5));
    }
}
