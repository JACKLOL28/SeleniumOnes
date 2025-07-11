package PracticeJava;

public class Checkthegivennoisprimeornot {
    public static void main(String[] args) {


        int n =41;
        int count= 0;

//        if(n>1)//Number less than 0 and 1 are not prime numbers
//        {
            for(int i=1; i<=n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
                if(count ==2)
                {
                    System.out.println("Number is prime number");
                }
                else {
                    System.out.println("Number is not a prime number");
                }
            }

        }
