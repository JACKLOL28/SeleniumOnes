package PracticeJava;

public class removespecialcharacterinstring {
    public static void main(String[] args) {
        String s = "abcdajava*()LOL";
        s = s.replaceAll("[*\\-()]", "");  // Corrected regex
        System.out.println(s);  // O

    }
}
