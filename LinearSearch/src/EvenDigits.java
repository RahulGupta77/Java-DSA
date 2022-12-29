public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1212, 21, 32, 3231, 213212, 1, 22 };
        Integer.MIN_VALUE
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {

        int count=0;
        for(int i=0; i<nums.length; i++){
            int digits = 0;
            int temp = nums[i];
            while(temp!=0){
                temp/=10;
                digits++;
            }
            if(digits%2==0)
                count++;
        }

        return count;

    }
}
