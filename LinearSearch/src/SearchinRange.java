import java.util.Scanner;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int target = input.nextInt();

        System.out.println("Enter the range to be find on: ");

        int start = input.nextInt();
        int end = input.nextInt();

        if(search(arr,target,start,end))
            System.out.println("The element is present");
        else
            System.out.println("The element is not present");
    }

    static boolean search(int[] arr,int num, int s, int e ){
        if(arr.length==0)
            return false;
        if(e>=arr.length || s<0)
            return false;

        for(int i=s; i<=e; i++){

            if(arr[i]==num)
                return true;
        }

        return false;

    }
}
