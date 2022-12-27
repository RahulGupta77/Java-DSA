import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Take input of two numbers and print the sum

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1+num2;

        System.out.println("The sum of two numbers is: "+ sum);
    }
}