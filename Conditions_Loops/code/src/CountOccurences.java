import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int a = input.nextInt();
        int count = 0;

        int temp = num1;

        while(temp!= 0 ){
            int rem = temp%10;
            temp = temp/10;
            if(rem == a)
                count++;

        }

        System.out.println("The number of occurrence is " + count);

    }
}
