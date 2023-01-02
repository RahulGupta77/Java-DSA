import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,-1,0,99};

        sort(arr);

        System.out.println(Arrays.toString(arr)); // original array is passed in the function
    }

    static void sort(int[] arr){

        boolean swapped;
        for(int i=0; i<arr.length-1;i++){
            swapped = false;
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if(swapped==false){
                System.out.println("EXECUTED");
                break;
            }
        }

    }
}

