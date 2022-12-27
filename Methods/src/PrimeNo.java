import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if(isPrime(num)){
            System.out.println("The given number is prime");
        }else{
            System.out.println("The given number is not prime");
        }

    }

    static boolean isPrime(int num){

        if(num==1)
            return false;

        for(int i =2; i<num/2; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

}
