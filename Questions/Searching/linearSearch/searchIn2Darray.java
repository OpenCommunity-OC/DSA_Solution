package Questions.Searching.linearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class searchIn2Darray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int target=5;
        int[] res=searchTwoD(arr, target);
        System.out.println(Arrays.toString(res));


    }
    static int[] searchTwoD(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
            
        }
        return null;

    }    
}
