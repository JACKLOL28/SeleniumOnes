package PracticeJava;

public class SecondminelementinArray {

        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10,2,3, 34, 1};

            int min = arr[0];
            int secondMin= arr[0];

            // First op to find the largest element
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            // Second loop to find the second largest element
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < secondMin && arr[i] > min) {
                    secondMin = arr[i];
                }
            }
                System.out.println("Second minimum is: " + secondMin);
            }
        }

