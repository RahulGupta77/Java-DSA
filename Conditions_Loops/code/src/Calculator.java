import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take an input from User until the user hits X or x
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        while(true){
            System.out.println("Please enter + - * / or x to exit");
            char ch = input.next().trim().charAt(0);

            if(ch == 'X' || ch == 'x' ){
                break;
            }
            else{
                if(ch == '+'){
                    System.out.println(num1 + num2);
                } else if (ch == '-') {
                    System.out.println(num1 - num2);
                } else if (ch == '*') {
                    System.out.println(num1 * num2);
                } else if(ch == '/'){
                    System.out.println(num1/num2);
                }else{
                    System.out.println("Invalid number");
                }
            }
        }
    }
}
