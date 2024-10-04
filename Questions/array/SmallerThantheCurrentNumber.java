package Questions.array;

import java.lang.reflect.Array;
import java.util.Arrays;

// Input: nums = [8,1,2,2,3]
// Output: [4,0,1,1,3]
// Explanation: 
// For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
// For nums[1]=1 does not exist any smaller number than it.
// For nums[2]=2 there exist one smaller number than it (1). 
// For nums[3]=2 there exist one smaller number than it (1). 
// For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
public class SmallerThantheCurrentNumber {
    public static void main(String[] args) {
        // int arr[]={8,1,2,2,3};
        int arr[]={6,5,4,8};
        int[] result = smallerNumber(arr);
        System.out.println(Arrays.toString(result));
    }
     static int[] smallerNumber(int[] arr){
        int[] newArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    count++;
                }
            }
            newArr[i]=count;
        }
        return newArr;
     }
}
