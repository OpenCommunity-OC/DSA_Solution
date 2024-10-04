package Questions.array;

import java.lang.reflect.Array;
import java.util.Arrays;

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]
public class concatArray {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int[] ans=concat(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] concat(int[] arr){
        int end=arr.length;
        int[] ans=new int[end*2];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[i];
            ans[end+i]=arr[i];
        }
        return ans;
    }
}
