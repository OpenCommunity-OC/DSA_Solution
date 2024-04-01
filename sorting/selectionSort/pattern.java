package sorting.selectionSort;

import java.util.Arrays;

public class pattern{
    public static void main(String[] args) {
        int[] arr={5, 2, 7, 1, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex=arr.length-i-1;
            int maxIndex=maxValue(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    // gettting a max value from a desired Range
    static int maxValue(int[]arr,int start, int end){
        int maxItem=start;
        for (int i = start; i <=end; i++) {
            if (arr[i]>arr[maxItem]){
                maxItem=i;
            }
        }
         return maxItem;
    }

    // here we will create a swapping method which basically swaps b/w two elements
    static void swap(int[] arr,int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}

//after debugging i have observed things which is every thing is based on operations of array indices.
// which ever method we have are returning its indices not the value.