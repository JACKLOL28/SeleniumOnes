package PracticeJava;

public class Findduplicatearray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 8, 9, 4, 10,9,8,9};

        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j <arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Found the duplicate element" +arr[i] + " ");
                    break;
                }
            }
        }
    }
}
