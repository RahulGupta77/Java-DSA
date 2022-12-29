import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int target = input.nextInt();
//        if(search(arr,target))
//            System.out.println("Element is present");
//        else
//            System.out.println("Element is not present");

        int[] pos = posSearch(arr, target);

        System.out.println(Arrays.toString(pos));

    }


    //return the position of that element

    static int[] posSearch(int [][] num, int target){

        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                if(num[i][j]==target)
                    return new int[] {i,j};
            }
        }

        return new int[]{-1,-1};

    }


    static boolean search(int[][] num, int target){

        if(num.length == 0){
            return false;
        }
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                if(num[i][j]==target)
                    return true;
            }
        }

        return false;
    }
}
