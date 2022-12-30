import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr={98,88,77,66,55,44,33,22,11};

        int[] arr1 = {11,22,33,44,55,66,77,88,99};

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int index = search(arr1,target);
        if(index==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element is present at: "+ index);
    }

    static int search(int[] arr, int target){
        int index;
        if(arr.length==0)
            return -1;

        if(arr[0]>arr[arr.length-1])
            index = DecSearch(arr, target);
        else
            index = AscSearch(arr, target);

        return index;

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
    static int AscSearch(int[] arr, int target){
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
