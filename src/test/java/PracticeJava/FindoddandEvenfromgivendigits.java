package PracticeJava;

public class FindoddandEvenfromgivendigits {
    public static void main(String[] args) {
        int num= 123456789;
        int odd_count=0;
        int even_count=0;

        while (num > 0) {
            int digit = num % 10;  // Extract last digit
            if (digit % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
            num /= 10;  // Remove last digit
        }
        System.out.println(even_count);
        System.out.println(odd_count);
    }
}
