public class LinearSearch {
    public static void main(String[] args) {
        String str = "Rahul";
        char ch= 'l';

        if(search(str,ch))
            System.out.println("Character is present");
        else
            System.out.println("Character is not present");

    }

    static boolean search(String str, char ch){
        if(str==null)
            return false;

        for(int i=0; i<str.length(); i++){
            if(str.trim().charAt(i)==ch)
                return true;
        }
        return false;
    }
}
