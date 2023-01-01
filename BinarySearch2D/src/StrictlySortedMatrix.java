import java.util.Arrays;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        int target = 25;

        int[] tr = searchElement(arr, target);

        System.out.println(Arrays.toString(tr));
    }




    //My solution (not optimised)
    static int[] searchElement(int[][] arr, int target){
        int startRow = 0;
        int endRow = arr.length-1;

        int midRow= (startRow + endRow)/2;
        int midEleIndex = (arr[midRow].length-1)/2;
       if(arr[midRow][midEleIndex]==target)
           return new int[]{midRow, midEleIndex};
       else if (arr[midRow][midEleIndex] > target) {
           endRow = midRow;
       }else{
           startRow = midRow;
       }

       while(startRow <= endRow){

           int tempStart = 0;
           int tempEnd = arr[startRow].length-1;

           while(tempStart <= tempEnd){

               int mid = tempStart + (tempEnd - tempStart)/2;

               if(arr[startRow][mid]== target)
                   return new int[]{startRow, mid};
               else if (arr[startRow][mid]< target)
                   tempStart = mid+1;
               else
                   tempEnd = mid;
           }
           startRow++;
       }
        return new int[]{-1, -1};
    }

//    static int searchMid(int[] arr, int target, int start, int end){
//
//
//        while(start<end){
//            int mid = start + (end-start)/2;
//
//            if(arr[mid]==target) {
//                return mid;
//            } else if (arr[mid] < target)
//                start = mid+1;
//            else end = mid;
//
//        }
//
//        return -1;
//
//
//    }
}
