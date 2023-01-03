import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDisappearedNos {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};

        ArrayList<Integer> ans = (ArrayList<Integer>) searchElements(arr);

        System.out.println(ans);

    }


    static List<Integer> searchElements(int[] arr) {

        sort(arr);
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1!=i){
                list.add(i+1);
            }
        }

        System.out.println(Arrays.toString(arr));
        return list ;
    }

    static void sort(int[] arr){

        int i = 0;

        while(i< arr.length){
            int correctIdx = arr[i]-1;
            if(arr[i]!= arr[correctIdx]){
                swap(arr, i, correctIdx);
            }else{
                i++;
            }

        }

    }

    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
