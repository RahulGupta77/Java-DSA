public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a','d', 'f', 'j', 'm', 'n'};
        char target = 'e';

        char ans = nextGreatestLetter(arr, target);

        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        if((int)letters[end] <= (int)target)
            return letters[start];

        int mid;

        while(start<=end){
            mid = start+(end-start)/2;

            if((int)letters[mid]>(int)target)
                end = mid-1;
            else
                start = mid+1;
        }

        return letters[start];
    }
}
