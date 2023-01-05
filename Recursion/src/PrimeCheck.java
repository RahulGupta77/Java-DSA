public class PrimeCheck {
    public static void main(String[] args) {
        int n = 6;

        if(checkprime(n, n/2) == -1){
            System.out.println("The given number is prime");
        }else{
            System.out.println("The given number is not prime");
        }

    }

    static int checkprime(int num, int divisor){
        if(divisor == 1)
            return -1;
        else if(num%divisor==0)
            return divisor;

        return checkprime(num, divisor-1);
    }
}
