package PracticeJava;

public class MissingelementinArray {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,7,8,9,10,11,12};

        int sum1=0;
        int sum2=0;

        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];

        }
        System.out.println(sum1);

        for(int i=1;i<=12;i++)
        {
            sum2=sum2+i;
        }

        System.out.println(sum2);
        System.out.println("Missing element in the array " +(sum2-sum1));
    }
}
