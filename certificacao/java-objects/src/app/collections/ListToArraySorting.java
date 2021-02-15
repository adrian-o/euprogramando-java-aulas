package app.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListToArraySorting {
    public static void main(String[] args) {
        List<String> canais = new ArrayList<>();
        canais.add("SóFirula");
        canais.add("EuProgramando");

        String[] canaisArr = canais.toArray(new String[]{});

//        for (String s : canaisArr)
//            System.out.println(s);

        System.out.println("Antes de ordenar -> " + canais);

        Collections.sort(canais);

        System.out.println("Depois de ordenar -> " + canais);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(81);
        numbers.add(2);

        System.out.println("Antes de ordenar -> " + numbers);

        Collections.sort(numbers);

        System.out.println("Depois de ordenar -> " + numbers);
    }
}
