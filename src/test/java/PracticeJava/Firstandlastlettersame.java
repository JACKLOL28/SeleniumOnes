package PracticeJava;

public class Firstandlastlettersame {
    public static void main(String[] args) {
        String []a= {"Cricket", "Bat", "Madam", "Radar", "AAiooo"};


        for(int i=0;i<a.length;i++){
            char first = Character.toLowerCase(a[i].charAt(0));
            char last = Character.toLowerCase(a[i].charAt(a[i].length()-1));

            if(first==last){
                System.out.println(a[i]);
            }
        }
    }
}
