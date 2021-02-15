package app.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] canais = {"SóFirula","EuProgramando"};

        List<String> canaisList = Arrays.asList(canais);

        Collections.sort(canaisList);

        System.out.println(canaisList);
    }
}
