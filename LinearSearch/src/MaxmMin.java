public class MaxmMin {
    public static void main(String[] args) {
        int[] arr = {44,55,66,77,88,99,-2};

        int min = min(arr);
        int max = max(arr);

        System.out.println(min+" "+max);
    }

    static int min(int[] num){

        int m = num[0];
        if(num.length==0){
            return Integer.MIN_VALUE;
        }
        for(int i=1; i<num.length; i++){
            if(num[i]<m){
                m=num[i];
            }
        }
        return m;
    }

    static int max(int[] num){
        int m = num[0];
        if(num.length==0){
            return Integer.MAX_VALUE;
        }
        for(int i=1; i<num.length; i++){
            if(num[i]>m){
                m=num[i];
            }
        }
        return m;
    }
}
