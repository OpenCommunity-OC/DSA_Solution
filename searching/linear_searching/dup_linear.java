package searching.linear_searching;

public class dup_linear {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int target = 4;
       boolean result=linearSearch(arr, target);
        System.out.println(result);
      
    }
    static boolean linearSearch(int[] arr, int target){
        if (arr.length==0) {
            return false;
        }
        //run for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                return true;
            }
        }
        return false;
    }
}
