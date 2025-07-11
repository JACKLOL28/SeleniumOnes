package PracticeJava;

import java.util.Arrays;

public class SwappingofElementsInsideArray {
    public static void main(String[] args) {

        int [] nums= {1,3,4,6,8,9};
        swap(nums,2,4);
        System.out.println(Arrays.toString(nums));
    }

    static void swap(int[]nums,int index1 , int index2){
        int temp= nums[index1];
        nums[index1] = nums[index2];
        nums[index2]=temp;

    }
}
