// 1512. Number of Good Pairs
// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

// Example 2:
// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.
package Questions.Arrays;

public class numberForGoodPair {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int res=numGoodPair(arr);
        System.out.println(res);
        
    }

    static int numGoodPair(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count=count+1;
                }
            }
        }
        return count;
    }
}

    

