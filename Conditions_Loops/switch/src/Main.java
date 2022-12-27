import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("The king of the fruits");
//            case "apple" -> System.out.println("A sweet red fruit");
//            case "grape" -> System.out.println("A small fruit");
//            default -> System.out.println("It is a random fruit");
//        }

        int num = input.nextInt();

        switch(num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Number");
        }
    }
}