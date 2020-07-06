package app.arrays;

import java.util.Arrays;

public class SortSearching {
    public static void main(String[] args) {
        int arr[] = {15,9,0,21,13,17,5};

        System.out.println("################################");

        for (int i : arr)
            System.out.print(i + " ");

        int busca = 0;

        System.out.println("Search -> " + Arrays.binarySearch(arr, busca));

        Arrays.sort(arr);
        System.out.println();

        for (int i : arr)
            System.out.print(i + " ");

        System.out.println("Search -> " + Arrays.binarySearch(arr, busca));
    }
}