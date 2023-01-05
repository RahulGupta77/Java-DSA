public class CheckSort {
    public static void main(String[] args) {
        int[] arr = {-32,-32,-1,0,1,2,3,5,6};

        if(checkSort(arr, 0, 1))
            System.out.println("The array is sorted");
        else
            System.out.println("THe array is not sorted");
    }

    static boolean checkSort(int[] arr, int idx1, int idx2){
        if(idx2==arr.length-1)
            return true;
        else if(arr[idx1]>arr[idx2])
            return false;

        return checkSort(arr, idx1+1, idx2+1);
    }
}
