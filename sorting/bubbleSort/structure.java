package sorting.bubbleSort;

import java.util.Arrays;

public class structure {
    public static void main(String[] args) {
        int[] arr={34,4,2,4,2,2,4,2,3,};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        //run the steps n-1 times

        //now this boolean is an addition optimizatio to an bubble sort array...understand that if no swaps are made one a single counter than it gonna break the loop.... because we already know that if no swaps are made than array is already at sorted manner.
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            // for each pass or Step the last the max item will come at the last
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                //swap the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
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
    }
    
}
