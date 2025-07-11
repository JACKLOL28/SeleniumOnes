package PracticeJava;

public class Armstrong {
    public static void main(String[] args) {
        int num =153;

        int orgnum=num;
        int digits;
        int checkarm=0;

        while(num>0){
            digits= num%10;
            checkarm= checkarm+(digits*digits*digits);
            num=num/10;


        }

        if(checkarm==orgnum){
            System.out.println("It is armstrong number");
        }
        else
        {
            System.out.println("It is not armstrong number ");
        }
    }
}
