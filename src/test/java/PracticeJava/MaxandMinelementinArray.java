package PracticeJava;

public class MaxandMinelementinArray {
    public static void main(String[] args) {

        int [] a= {12,32,43,5,2,45,23,89,90,21,67};
        int min= a[0];
                int max = a[0];

                for(int i=0;i<a.length;i++){
                    if(a[i]<min) {
                        min = a[i];
                    }
                    if(a[i]> max){
                        max=a[i];
                    }
                }
        System.out.println("Smallest element in array " +min);
        System.out.println("Biggest element in array " +max);
    }
}
