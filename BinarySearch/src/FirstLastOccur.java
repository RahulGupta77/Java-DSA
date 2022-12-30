public class FirstLastOccur {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 8;

        int Index1 = kfirstOccur(arr, target);
        int Index2 = klastOccur(arr, target);

        System.out.println(Index1 + " " + Index2);
    }


    static int kfirstOccur(int[] arr, int target){
        if(arr.length==0)
            return -1;
        int start = 0;
        int end = arr.length-1;
        int mid, index=0;
        while(start<=end) {
            mid = start + (end - start) / 2;

            if(arr[mid]==target){
                index = mid;
                end = mid-1;
            }else if (arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        if(arr[index]==target)
            return index;
        return -1;
    }

    static int klastOccur(int[] arr, int target){
        if(arr.length==0)
            return -1;
        int start = 0;
        int end = arr.length-1;
        int mid, index=0;
        while(start<=end) {
            mid = start + (end - start) / 2;

            if(arr[mid]==target){
                index = mid;
                start=mid+1;
            }else if (arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        if(arr[index]==target)
            return index;
        return -1;
    }

}
