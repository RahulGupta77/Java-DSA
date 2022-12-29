import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr={98,88,77,66,55,44,33,22,11};

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int index = DecSearch(arr,target);
        if(index==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element is present at: "+ index);
    }

    static int DecSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid;

        while(start<=end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                end= mid-1;
            } else
                start = mid+1;
        }
        return -1;
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid;

        while(start<=end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return -1;
    }
}