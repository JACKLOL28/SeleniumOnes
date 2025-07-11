package PracticeJava;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String s = "Listen";
        String s1="Silent";

        String str1 = s.replaceAll("\\s", "").toLowerCase();
        String str2 = s.replaceAll("\\s", "").toLowerCase();
        char[] a1 = str1.toCharArray();
       char[] a2= str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1, a2)){
            System.out.println("The Strings are anagrams");
        }
        else{
            System.out.println("Strings are not anagrams");
        }
    }
}
