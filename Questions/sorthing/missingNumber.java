package Questions.sorthing;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
      int[] arr={3,0,1};
      int result=missingNumber(arr);
      System.out.println(result);
    }
    static int missingNumber(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct]) {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
