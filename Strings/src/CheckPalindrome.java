public class CheckPalindrome {
    public static void main(String[] args) {
        String ch ="fnafnaa";
        int i=0;
        int j=ch.length()-1;

        while(i<j){
            if(ch.charAt(i)!=ch.charAt(j)){
                System.out.println("String is not palindrome");
                break;
            }
            i++;
            j--;

        }

        if(i>j){
            System.out.println("String is palindrome");
        }
    }
}
