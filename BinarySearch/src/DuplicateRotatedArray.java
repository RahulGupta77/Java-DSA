public class DuplicateRotatedArray {
    public static void main(String[] args) {

        int[] arr = {2,2,2,3,2,2,2};
        if(search(arr, 3))
            System.out.println("Element is present");
        else
            System.out.println("Element is not present");


    }

    static boolean search(int[] arr, int target) {
        int peakIndex = findPeak(arr);

        if(peakIndex!= -1 && arr[peakIndex] == target)
            return true;

        if(search(arr, target, 0, peakIndex-1) || search(arr, target, peakIndex+1, arr.length-1))
            return true;

        return false;
    }

    static boolean search(int[] arr, int target, int start, int end){
        int mid;

        while(start<=end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target && arr[mid]!=arr[end]) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return false;
    }


    static int findPeak(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(mid<end && arr[mid] > arr[mid+1])
                return mid;
            else if( mid > start && arr[mid] < arr[mid-1])
                return mid-1;

            if(start==end)
                return start;
            // if elements at start, end, middle are equal just skip the elements

            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip duplicates
                //note: what if elements at start and end were the pivots
                //check is start is pivot
                if(arr[start] > arr[start+1])
                    return start;

                start++;

                //check if end is pivot or not
                if(arr[end]<arr[end-1])
                    return end-1;

                end--;

            }
            //left side is sorted so pivot should be at right
            else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end]))
                start= mid+1;
            else
                end= mid-1;

        }
        return -1;
    }
}
