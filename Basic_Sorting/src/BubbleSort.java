import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-32, -3, 21, 32, 34, 43, 99, 121, 232};

        kunalSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void kunalSort(int[] arr) {

        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            if (swapped == false) {
                System.out.println("EXECUTED");
                break;
            }
        }

    }

    static void sort(int[] arr) {

        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }
            if (swapped == false) {
                System.out.println("EXECUTED");
                break;
            }

        }
    }
}

