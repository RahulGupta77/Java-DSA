import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = input.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b );
        for(int i=1; i<range; i++){
            sum = a+b;
            a= b;
            b = sum;
            System.out.print(" " + sum);
        }

    }
}
