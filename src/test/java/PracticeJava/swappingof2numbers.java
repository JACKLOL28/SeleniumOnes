package PracticeJava;

import java.util.Scanner;

public class swappingof2numbers {
    public static void main(String[] args) {
        //1 .Using temo variable

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the two values");
//        int a =sc.nextInt();
//        int b= sc.nextInt();
//        int temp;
//
//        temp=a;
//        a=b;
//        b=temp;
//
//        System.out.println("The swapped number are :" +a +" " +b);


        //2 without using temo variable
        int a=10;
        int b= 20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(+a +" " +b);
    }
}
