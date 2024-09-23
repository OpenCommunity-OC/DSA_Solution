
package Questions.sorthing;
import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        missingNumberCheck(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
    static void missingNumberCheck(int[] arr){
        int i=0;
        while (i<arr.length){
            int corect=arr[i]-1;
            if (arr[i]!=arr[corect]){
                swap(arr,i,corect)
            }
            else{
                i++;
            }
        }
    }
    static void swap(int arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
// 268. Missing Number
/*
    Example 1:

    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
    2 is the missing number in the range since it does not appear in nums.
 */
// Hint: 
// Array elements ranges from [0 upto n], this is the major hint stating use cyclic sort
// Distinct numbers in the range
