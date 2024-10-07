package Questions.array;
// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
public class twoSum {
    public static void main(String[] args) {
    int[] arr={2,7,11,15};    
    int[] res=twoSum(arr, 9);
    System.out.println(res[0]+" "+res[1]);
    
    }
    static int[] twoSum(int[] arr, int target){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum=arr[i]+arr[j];
                if (sum==target) {
            
                    return new int[] {i,j}; 
                }
            }
        }
        return new int[]{-1,-1};
    }
}
