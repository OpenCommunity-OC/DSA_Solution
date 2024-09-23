package searching.linear_searching;

public class dup_minElement {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5,6,7,8};
        int reult=minimumElement(arr);
        System.out.println(reult);

    }
    static int minimumElement(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
    
}
