package PracticeJava;

import java.util.Arrays;

public class ArrayssortwithoutusingSort {
    public static void main(String[] args) {
        int []a= {3,7,2,1,9,4,54,89,45,76,65};
        int temp=0;
        for(int i=0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));



    }
}
