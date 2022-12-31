public class MontainArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,1};
        int target = 2;

        int peakIndex = findPeak(arr);
        int ans = -1;

        if(orderAgnostic(arr, target, 0, peakIndex)==-1){
            ans =  orderAgnostic(arr, target, peakIndex, arr.length-1);
        }else
            ans = orderAgnostic(arr, target, 0, peakIndex);

        System.out.println(ans);
    }


    static int orderAgnostic(int[] arr, int target, int start, int end){

        if(arr[start]<arr[end]){
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
        } else{
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
        }
        return -1;
    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid= start+(end-start)/2;

            if(arr[mid]<arr[mid+1])
                start = mid+1;
            else end = mid;
        }

        return start;

    }
}
