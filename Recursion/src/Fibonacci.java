public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(search(n));
    }

    static int search(int n){

        if(n<2)
            return n;  

        return search(n-1) + search(n-2);
    }
}
