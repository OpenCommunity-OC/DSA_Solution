package Questions.array;

import java.util.Arrays;

//Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
public class runningSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] result=runningSum(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] runningSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
          arr[i]+=arr[i-1];
            
        }
        return arr;
    }
}
