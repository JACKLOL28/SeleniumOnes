package PracticeJava;

public class CountnoOfDigits {

    public static void main(String[] args) {


        int num = 3421345;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
