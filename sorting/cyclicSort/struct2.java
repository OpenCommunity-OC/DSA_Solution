// 268. Missing Number
package sorting.cyclicSort;

import java.util.Arrays;

public class struct2 {
    public static void main(String[] args) {
        int[] arr={0,1};
        int res=sort(arr);
        System.out.println(res);
    }

    static int sort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct=arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index){
                return index++;
            }
        }
        return arr.length;

    }
    static void swap(int[] arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
    }
}
