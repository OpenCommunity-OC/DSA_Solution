//two Sum
// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Input: nums = [3,2,1], target = 6
// Output: [1,2]

package Questions.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr, target)));


        
    }
    static int[] twoSum(int[] arr, int target){

        int[] arr2={0,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    arr2[0]=i;
                    arr2[1]=j;

                }
            }
        }
        return arr2;
    }
    
}
