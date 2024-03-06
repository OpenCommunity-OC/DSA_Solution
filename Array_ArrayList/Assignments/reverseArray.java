package Array_ArrayList.Assignments;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(arr);

    }
    static void reverseArray(int[] arr){
    
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }

    
    }
    
}
