package PracticeJava;

import java.util.*;

public class RotateArray {

    public static void main(String[] args) {


        //Right rotate
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Collections.rotate(list,2);

        System.out.println(list);

        //left rotate
        List<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.rotate(list1,-2);
        System.out.println(list1);
    }
}
