import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'R', 'a', 'h', 'u', 'l'};

        System.out.println(Arrays.toString(reverse(arr, 0, arr.length-1)));
    }

    static char[] reverse(char[] arr, int s, int e){

        if(s==e)
            return new char[]{arr[s]};


        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        return reverse(arr, s+1, e-1);

    }
}
