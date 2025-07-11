package PracticeJava;

public class Findevenandoddnumberinarray {
    public static void main(String[] args) {


        int[] a = {2, 5, 6, 9, 8, 71};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Number even in array are " + a[i]);
            } else {
                System.out.println("Odd numbers in array are " + a[i]);
            }
        }

    }
}
