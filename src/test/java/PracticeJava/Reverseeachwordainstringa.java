package PracticeJava;

public class Reverseeachwordainstringa {
    public static void main(String[] args) {


    String s1= "Welcome to seleniium";
    String reverseString= "";
        String[] words = s1.split(" ");

        for(String w:words){
            String reversewords= "";

            for(int i=w.length()-1;i>=0;i--){
                reversewords=reversewords+w.charAt(i);
            }
            reverseString=reverseString+reversewords+" ";
        }

        System.out.println(reverseString);

}
}