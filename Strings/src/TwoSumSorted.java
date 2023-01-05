import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int arr[] = {0,1};
        int target = 1;
        int[] ans = twoSum(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] arr, int target) {

        int ele = 0;
        int s = 0;
        int e = arr.length-1;

        while(e>=0 && s<=arr.length-1){
            int mid = s+ (e-s)/2;

            if(arr[mid]==target){
                return new int[]{1,mid+1};
            }
            if(arr[mid]<target && (mid==arr.length-1 || arr[mid+1]>target)){
                int temp = search(arr, target-arr[mid]);
                if(temp !=-1){
                    return new int[]{temp+1, mid+1};
                }else{
                    s = 0;
                    e = mid-1;
                }
            }else if(arr[mid]> target){
                e = mid;
            }else{
                s = mid+1;
            }
        }

        return new int[]{-1, -1};

    }

    //returns index of target value
    static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        while(s <= e){

            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]< target){
                s = mid+1;
            }else{
                e = mid;
            }

        }

        return -1;
    }

}
