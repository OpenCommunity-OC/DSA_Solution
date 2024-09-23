package searching.linear_searching;

public class dup_maxElement {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5,6,7,8};
        int reult=maxElement(arr);
        System.out.println(reult);
    }
    static int maxElement(int[] arr){
        // 1,2,3,4
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) { // 2>1: true
                max=arr[i];
            }
        }
        return max;
    }
    
}
