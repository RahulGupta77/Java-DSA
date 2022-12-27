import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char alpha = input.next().trim().charAt(0);

        if (alpha >= 65 && alpha<=90){
            System.out.println("The given character is Uppercase");
        } else if(alpha >= 97 && alpha <= 122){
            System.out.println("The given character is Lowercase");
        }
    }
}
