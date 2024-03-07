package searching.linear_searching;

public class linear_search_program {
    public static void main(String[] args) {
        int[] arr={};
        int target=2;
        int result=linear_search(arr, target);
        System.out.println(result);

        linear_search(arr,target);
    }

    static int linear_search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
