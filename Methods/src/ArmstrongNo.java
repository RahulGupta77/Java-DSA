public class ArmstrongNo {
    public static void main(String[] args) {
        Armstrong();
    }

    static int Calculation(int n){

        int temp = n;
        int sum = 0;

        while(temp!=0){

            int digit = temp%10;
            temp/=10;
            sum+=digit*digit*digit;
        }

        return sum;

    }
    static void Armstrong(){

        for(int i=100; i<1000; i++){

            int cal = Calculation(i);
            if(cal==i){
                System.out.print(" "+ i);
            }
        }
    }
}
