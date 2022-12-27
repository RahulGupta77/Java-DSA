import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter 1st number ");
        int num1 = input.nextInt();
        System.out.printf("Enter 2nd number ");
        int num2 = input.nextInt();
        System.out.printf("Enter 3rd number ");
        int num3 = input.nextInt();

//        if(num1 > num2 && num1 > num3){
//            System.out.println("The largest number is " + num1);
//        } else if (num2> num1 && num2>num3){
//            System.out.println("The largest number is "+ num2);
//        }else{
//            System.out.println("The largest number is " + num3);
//        }

        int max = Math.max(num3, Math.max(num1, num2));
        System.out.println(max);
    }
}
