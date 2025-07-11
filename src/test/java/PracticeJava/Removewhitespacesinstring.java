package PracticeJava;

public class Removewhitespacesinstring {
    public static void main(String[] args) {

        String s= "Java     euuuu     programming";
        s=s.replaceAll("\\s", "");

        System.out.println(s);
    }
}
