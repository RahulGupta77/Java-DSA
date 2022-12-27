public class ReverseNum {
    public static void main(String[] args) {
        int num = 98765;
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int rem = temp%10;
            rev = 10*rev + rem;
            temp/= 10;
        }
        System.out.println(rev);
    }
}
