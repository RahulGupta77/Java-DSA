import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
           arr[i] = input.nextInt();
        }

        swap(arr,0,4);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[]num , int a, int b){
        int temp= num[a];
        num[a] = num[b];
        num[b]=temp;
    }
}
