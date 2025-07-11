package PracticeJava;

public class ReverseNum {
    public static void main(String[] args) {

        int num = 345679;
        int digits;
        int reverse=0;


        while (num != 0) {
           digits= num%10;
           reverse= (reverse*10)+digits;

            num = num/10; //-- Eliminating the last digits
        }
        System.out.println(reverse);
    }


}
