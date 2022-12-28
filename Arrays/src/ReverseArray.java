import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    static void rev(int[]num , int a, int b){

        while(a < b){
            int temp= num[a];
            num[a] = num[b];
            num[b]=temp;
            a++;
            b--;

        }

    }
}
