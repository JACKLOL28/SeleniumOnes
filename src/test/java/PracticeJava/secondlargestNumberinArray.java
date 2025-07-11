package PracticeJava;

public class secondlargestNumberinArray {

        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 34, 1};

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            // First loop to find the largest element
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

            // Second loop to find the second largest element
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > secondLargest && arr[i] <largest) {
                    secondLargest = arr[i];
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest element");
            } else {
                System.out.println("Second largest element is: " + secondLargest);
            }
        }
    }


