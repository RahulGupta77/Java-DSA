public class StringComparisons {

    public static void main(String[] args) {
        String a = new String("Rahul");
        String b = new String("Rahul");

        System.out.println(a==b); //returns true only if pointng to same object
        System.out.println(a.equals(b)); // returns true only if values are same
    }
}

