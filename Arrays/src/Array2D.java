import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        Scanner input =  new Scanner(System.in);
        System.out.println(arr.length);

        //taking an input
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[j].length; j++){
                arr[i][j]= input.nextInt();
            }
        }

        // output
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
