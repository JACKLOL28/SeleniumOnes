package PracticeJava;

public class SearchElementinArray {
    public static void main(String[] args) {
        int [] a= {10,34,45,67,90,76};
        int search_element= 45;

        for(int i=0;i<a.length;i++){
            if(a[i]==search_element){
                System.out.println("Element found " +a[i]);

            }

        }
        ;

    }
}
