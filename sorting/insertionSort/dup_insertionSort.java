package sorting.insertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dup_insertionSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        insertionSort(arr);
    //    System.out.println(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) { // here, i < arr.length-1 is bcoz j=i+1 .. i cant go to the last index.. just bcoz it will pass index out of bound
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    } 
}
