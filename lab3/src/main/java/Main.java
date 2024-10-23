import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        // task2();
    }

    public static void task1() {
        // (task1) bubbleSort
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        arr = bubbleSort(arr);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void task2() {
        //         task2 matrix[x][y]
        int [][] matrix = new int[5][];
        System.out.println("\nCreating matrix:");
        for (int i = 0; i < 5; i++) {
            matrix[i] = new int[(int) (Math.random() * 5 + 2)];         // value from [2:7)
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (201)) - 100;     // [-100:100]
            }
        }
        printMatrix(matrix);
        System.out.println("Sorted rows of the matrix:");
        for (int i = 0; i < 5; i++) {
            Arrays.sort(matrix[i]);
        }
        System.out.println("\nResult of the sort:");
        printMatrix(matrix);

        System.out.println("Negative values:");
        printNegativeMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int [] row : matrix) {
            for (int item : row) {
                System.out.printf("%4d ", item);
            }
            System.out.println();
        }
    }

    public static void printNegativeMatrix(int[][] matrix) {
        for (int [] row : matrix) {
            for (int item : row) {
                if (item >= 0) {
                    break;
                }
                System.out.printf("%4d ", item);
            }
            System.out.println();
        }
    }

    public static int [] bubbleSort(int [] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        if (!swapped) {
            if (arr.length < 1)
                System.out.println("No elements in array!");
            else
                System.out.println("Elements in array are sorted!");
        }
        return arr;
    }
}
