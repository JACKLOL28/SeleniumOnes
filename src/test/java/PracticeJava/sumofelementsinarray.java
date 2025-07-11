package PracticeJava;

public class sumofelementsinarray {
    public static void main(String[] args) {

        int[] a = {1, 7, 8, 9, 56, 87};

        int sum = 0;

        for (int i = 0; i<a.length; i++){
            sum=sum+a[i];

        }
        System.out.println(sum);

    }
}