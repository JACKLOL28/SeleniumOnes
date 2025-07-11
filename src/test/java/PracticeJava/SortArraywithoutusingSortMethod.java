package PracticeJava;

public class SortArraywithoutusingSortMethod {
        public static void main(String[] args) {
            int[] arr = {5, 2, 8, 1, 3};

            // Simple sorting using nested loops
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        // Swap
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            // Print sorted array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

