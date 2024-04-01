package sorting.selectionSort;

import java.util.Arrays;

public class structure {
    public static void main(String[] args) {
        int[] arr={5, 2, 7, 1, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    //function for selectionSort
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find max item  in remaining array and swap with correct index
            int last=arr.length-i-1;
            int maxValue=maxIndex(arr, 0, last);
            swap(arr, maxValue, last);
        }
    }
    // function for max value from an arr
    static int maxIndex(int[] arr,int start,int end){
        int maxVal=start;
        for (int i = 0; i <=end; i++) {
            if (arr[i]>maxVal) {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    //function for swapping the swp bascially whihc add sthe two number
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    } 
}
