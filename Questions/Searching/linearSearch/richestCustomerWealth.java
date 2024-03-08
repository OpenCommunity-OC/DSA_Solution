//1672. Richest Customer Wealth
package Questions.Searching.linearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5},{10,10,10}};
        int res=CustomerWealth(arr);
        System.out.println((res));
 
    }
    static int CustomerWealth(int [][]arr){
        //smart Move
        int[] sum=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int add=0;
            for (int j = 0; j < arr[i].length; j++) {
                add=add+arr[i][j];
            }
            sum[i]=add;
        }
        int res=maxSum(sum);
        return res;
    }

    static int maxSum(int[] arr){
        int maxValue=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
    
}
