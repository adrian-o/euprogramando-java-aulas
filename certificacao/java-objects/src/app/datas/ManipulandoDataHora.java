package app.datas;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ManipulandoDataHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Data da primeira dose (dd/MM/yyyy): ");
        String data1Dose = sc.next();

        System.out.println("Hora da primeira dose (HH:mm): ");
        String hora1Dose = sc.next();

        System.out.println("Quantidade de doses: ");
        int qtdDoses = sc.nextInt();

        System.out.println("Intervalo de horas entre as doses: ");
        int intDoses = sc.nextInt();

        LocalDateTime dataHora = LocalDateTime.of(
                Integer.valueOf(data1Dose.split("/")[2]),
                Integer.valueOf(data1Dose.split("/")[1]),
                Integer.valueOf(data1Dose.split("/")[0]),
                Integer.valueOf(hora1Dose.split(":")[0]),
                Integer.valueOf(hora1Dose.split(":")[1])
        );

        System.out.println("\n## Agenda de medicamentos ##");
        System.out.println(dataHora);

        for (int i = 0 ; i < (qtdDoses-1) ; i++) {
            dataHora = dataHora.plusHours(intDoses);
            System.out.println(dataHora);
        }
    }
}
