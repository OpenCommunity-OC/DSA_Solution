package Questions.Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(getConcat(arr)));
        
    }
    static int[] getConcat(int[] nums){
        //here we are taking the length of an array i.e nums in variable n
        int n=nums.length;
        //here we are creating an another array of double the size of nums[]...n*2
        int[] arr=new int[n*2];

        for (int i = 0; i < nums.length; i++) {
            //logic for first portion as only initialising
            arr[i]=nums[i];
            //logic for second portion is we are getting the size of an array and adding with i... as iterations
            arr[n+i]=nums[i];
        }

        return arr;
    }
    
}
