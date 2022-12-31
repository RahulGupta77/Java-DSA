public class RotatedArrayPeakElement {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};

        int peakIndex = findPeak(arr);
        System.out.println(peakIndex);

    }

    static int findPeak(int[] arr){

        int start = 0;
        int end = arr.length-1;
        int max = arr[0];
        int maxIndex = 0;

        if(start==end)
            return start;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(max>arr[mid]) {
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
