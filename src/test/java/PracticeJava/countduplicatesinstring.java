package PracticeJava;

public class countduplicatesinstring {
    public static void main(String[] args) {


        String s = "Java ekdum kadak language hai baba";
        int total_count = s.length();

        int removal_after_a= s.replaceAll("a","").length();
        int occ= total_count-removal_after_a;
        System.out.println(occ);

    }
}