package PracticeJava;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("PLease enter the string:");


        String rev = sc.next();
        String act= "";

        for(int i= rev.length()-1;i>=0;i--){
            act=act+rev.charAt(i);

        }

        System.out.println("Reverse string :" +act);

//        //2 Approach without using strings methods
//
//        String s = sc.nextLine();
//        String rev="";
//
//        char a[]= s.toCharArray();
//        for(int i= s.length()-1;i>=0;i--)
//        {
//            rev=rev+a[i];
//        }
//        System.out.println(rev);


    }
}
