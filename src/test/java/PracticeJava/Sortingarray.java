package PracticeJava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sortingarray {
    public static void main(String[] args) {
        int []  a= {34,76,45,21,8,56,43,41,98,89,99};
        System.out.println("Array before sorting :" + Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(a[9]);

        System.out.println("Arraya after sorting: " + Arrays.toString(a));
    }
}
