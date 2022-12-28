import java.util.Scanner;

public class MaxmElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        int ele = maxm(arr);

        System.out.println("Maxm ELement is: "+ele);
    }

    static int maxm(int[] num){
        int max = num[0];

        for(int i=1; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }
}
