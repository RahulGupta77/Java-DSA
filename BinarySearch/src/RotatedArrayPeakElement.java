import javax.lang.model.element.Element;

public class RotatedArrayPeakElement {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int target = 0;
        int peakIndex = findPeak(arr);

        System.out.println(peakIndex);

        if(arr[peakIndex] == target)
            System.out.println("Element is present at "+ peakIndex);

        if(search(arr, target, 0, peakIndex-1))
        System.out.println("Element is present in first half of " + peakIndex);
        else if(search(arr, target, peakIndex+1, arr.length-1))
            System.out.println("Element is present in second half of "+ peakIndex);
        else
            System.out.println("Element is not present");

    }


    static boolean search(int[] arr, int target, int start, int end){
        int mid;

        while(start<=end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return false;
    }
    static int findPeak(int[] arr){

        int start = 0;
        int end = arr.length-1;
        int max = arr[0];
        int maxIndex = 0;

        if(start==end)
            return start;

        if(arr[start]<arr[end])
            return end;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1])
                return mid;
            else if( mid > start && arr[mid] < arr[mid-1])
                return mid-1;
            if(arr[mid]==arr[end]){
                max = arr[mid];
                maxIndex = mid;
                end = mid;
                }
            else if(max>arr[mid]) {
                end = mid - 1;
            }
            else{
                max = arr[mid];
                maxIndex = mid;
                start = mid+1;
            }

        }

        return maxIndex;

    }
}
