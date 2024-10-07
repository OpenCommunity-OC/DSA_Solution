package sorting.cyclicSort;

import java.util.Arrays;

public class dup_cyclicSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
                // 1.2.3.4  
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1; //gettign the correct index
            if (arr[i]==arr[correct]) {
                i++;
            }
            else{
                swap(arr, i,correct);
            }            
        }
    }
    static void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
