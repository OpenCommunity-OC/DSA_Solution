package sorting.bubbleSort;

import java.util.Arrays;

public class dup_bubbleSort {
    public static void main(String[] args) {
        // int[] arr = {4, 2, 9, 6, 5};
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] bubbleSort(int[] arr){
        // this if for the the swapped
        // boolean swapped;
        for (int i = 0; i < arr.length; i++) {
          boolean swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            } 
            if (!swapped) {
                break;
            }
        }
        return arr;
    }  
}
