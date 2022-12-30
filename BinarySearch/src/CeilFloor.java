public class CeilFloor {
    public static void main(String[] args) {
        int[] arr= {1,2,8,10,10,12,19};
        int x = 20;

        int ceil = Ceil(arr, x);

        int floor = Floor(arr, x);

        if(ceil == Integer.MIN_VALUE)
            System.out.println("No ceil value exists");
        else
            System.out.println(ceil);

        if(floor == Integer.MIN_VALUE)
            System.out.println("No floor value exists");
        else
            System.out.println(floor);

    }


    static int Floor(int[] arr, int target){
        int start = 0, end = arr.length-1;
        int mid ;

        if(target<arr[start])
            return Integer.MIN_VALUE;

        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if (arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }

        return arr[end];

    }
    static int Ceil(int[] arr, int target){
        int start = 0, end = arr.length-1;
        int mid ;

        if(target>arr[end])
            return Integer.MIN_VALUE;

        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if (arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }

        return arr[start];

    }

}
