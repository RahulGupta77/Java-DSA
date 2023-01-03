import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2,2};

        sort(arr);


        int i=0;
        int ans = i;

        while(i<arr.length){
            if(i==arr[i]-1){
                i++;
            }else{
                System.out.println(i+1);
                break;
            }
        }

        System.out.println(arr.length);

        System.out.println(Arrays.toString(arr));
    }



    //this code works well
    static void sort(int[] arr){

        int i = 0;

        while(i< arr.length){
            if(arr[i] > 0) {
                int correctIdx = arr[i] - 1;
                if (correctIdx < arr.length && correctIdx >= 0 && arr[i] != arr[correctIdx]) {
                    swap(arr, i, correctIdx);
                } else {
                    i++;
                }
            }else{
                i++;
            }


        }

    }


    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
