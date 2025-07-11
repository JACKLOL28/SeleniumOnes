package PracticeJava;

public class CheckPalindrome {
    public static void main(String[] args) {

        int num =757;
        int original_num= num;
        int reverse=0;
        int digits;

        while(num!=0){
            digits= num%10;
            reverse= reverse*10+digits;
            num=num/10;

        }

        if(original_num==reverse){
            System.out.println("No is palindrome");
        }
        else
            System.out.println("No is not palindrome");
    }
}
