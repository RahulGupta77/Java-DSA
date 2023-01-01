import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = { {10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50},};
        int target = 37;

        int[] ans = kunalsearch(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] kunalsearch(int[][] arr, int target){

        int row=0;
        int column = arr[0].length-1;

        while(row < arr.length && column>=0){
            if(arr[row][column]==target)
                return new int[] {row,column};
            else if(arr[row][column]<target)
                row++;
            else
                column--;
        }
        return new int[] {-1,-1};
    }
    static int[] search2d(int[][] arr, int target){

        int[] ans = {-1,-1};

        int row = 0;
        int column = arr[0].length-1;

        while(row < arr.length){
            while(column>=0 && row < arr.length){
                if(arr[row][column]==target){
                    ans[0]= row;
                    ans[1]=column;
                    return ans;
                } else if (arr[row][column]> target ) {
                    column--;
                }
                else if (arr[row][column]<target){
                    row++;
                }
                else{
                    column++;
                }
            }
            row++;
        }

        return ans;
    }
}