public class InfinteNumbers {
    public static void main(String[] args) {
        int[] arr = {40,48,61,75,100,99,98,39,30,10};
        int start = 0;
        int end = arr.length;

        int mid=0;

        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid-1]<arr[mid]&& arr[mid]>arr[mid+1])
                break;
            else if(arr[mid-1]<arr[mid] && arr[mid+1]>arr[mid])
                start = mid+1;
            else
                end = mid;
        }

        System.out.println(mid);
    }

}
