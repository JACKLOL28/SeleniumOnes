package PracticeJava;

public class PivotIndextry {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 5,6,7,4, 1, 3, 8,2,16};

        int leftsum=0;
        int totalsum=0;

        for(int i=0; i<a.length;i++){
            totalsum=totalsum+a[i];
        }

        for(int i=0;i<a.length;i++){
            if(leftsum==totalsum-leftsum-a[i]){
                System.out.println("pivout found "  +i);
            }
            leftsum=leftsum+a[i];
        }
    }
}