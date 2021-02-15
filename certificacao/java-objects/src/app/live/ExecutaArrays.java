package app.live;

import java.util.Arrays;

public class ExecutaArrays {
    public static void main(String[] args) {
//        Array2[][] a2 = new Array2[][]{};
//
//        Array1[] a1 = a2;

        Array1 a1 = new Array1();
        System.out.println(a1.toString());

        String[] s1 = new String[0];


        String[] os = new String[]{"Windows","Mac","Linux"};
        System.out.println(Arrays.binarySearch(os, "Mac"));


        Arrays.sort(s1);
        Array2 a2 = new Array2();
        System.out.println(a2.toString());
        System.out.println(a2.toString(" *é meu*"));
        a2.meuMetodo("");



        int[] numbers = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3));

    }
}


//  0  1  2
// [] [] []
// tamanho 3
// arr[arr.length] -> Exception ArrayIndexOutofBounds
