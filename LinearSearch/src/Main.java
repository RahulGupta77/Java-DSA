import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the element to be searched: ");

        int var = input.nextInt();

        int index = search(arr, var);

        if(var==-1){
            System.out.println("The element does not exists");
        } else{
            System.out.println("The element is at index: "+ index);
        }

    }

    //search in the array: return the index if item found
    //if item not found: return -1

    static int search(int[] arr, int num){

        if(arr.length == 0)
            return  -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}