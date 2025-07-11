package PracticeJava;

public interface ReverseStringSent {
    public static void main(String[] args) {
        String sent= "Automation code is cool";

       String []arr= sent.split(" ");
       String rev= " ";
       for(int i=arr.length-1; i>=0;i--){
           rev= rev+ arr[i]+ " ";

       }
        System.out.println(rev);
    }
}
