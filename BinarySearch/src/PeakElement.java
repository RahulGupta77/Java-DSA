public class PeakElement {
    public static void main(String[] args) {

        int[] arr = {6,7,8,5,4,3,2,1};

        int peakIndex = findPeak(arr);

        System.out.println(peakIndex);
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
