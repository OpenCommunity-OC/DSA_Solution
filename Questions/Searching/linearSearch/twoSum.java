package Questions.Searching.linearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;
// Input: numbers = [-1,0], target = -1
// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
public class twoSum {
    public static void main(String[] args) {
        int[] arr={-1,0};
        int target=-1;
        int[] res =twoSum(arr, target);
        System.out.println(Arrays.toString(res));

        
    }
    static int[] twoSum(int[] arr,int target){
        int[] arr2={0,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                     arr2[0]=i+1;
                     arr2[1]=j+1;
                     return arr2;
                }
            }
        }
        return arr2;
    }
    
}
