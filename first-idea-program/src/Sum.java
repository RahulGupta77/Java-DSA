import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a+b;
        System.out.println("Addition of given two numbers are: " + c);

    }
}
