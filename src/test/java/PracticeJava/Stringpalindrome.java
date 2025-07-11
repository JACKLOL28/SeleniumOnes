package PracticeJava;

public class Stringpalindrome {
    public static void main(String[] args) {
        String s = "WOW";
        String r = "";

        for(int i=s.length()-1;i>=0;i--){
            r= r+s.charAt(i);
        }
        if(r.equals(s))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("OOps string is not palindrome");
        }
    }
}
