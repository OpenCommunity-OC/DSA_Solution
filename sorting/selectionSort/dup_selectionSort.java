package sorting.selectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dup_selectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex=arr.length-i-1;
            int maxIndex=getMax(arr,0, lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }
    static int getMax(int[] arr, int start, int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if (arr[max]<arr[i]) {
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    } 
    
}
