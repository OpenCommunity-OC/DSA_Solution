package Questions.array;
// Example 1:
// Input: num = [1,2,0,0], k = 34
// Output: [1,2,3,4]
// Explanation: 1200 + 34 = 1234

import java.util.Arrays;

// Example 2:
// Input: num = [2,7,4], k = 181
// Output: [4,5,5]
// Explanation: 274 + 181 = 455
public class AddArrayToFormInteger {
    public static void main(String[] args) {
        int[] arr={1,2,0,0};
        int k=34;
        // int[] arr={2,7,4};
        // int k=181;
        int res[]=toInteger(arr, k);  
        System.out.println(Arrays.toString(res));
    }
    static int[] toInteger(int[] arr, int addNum){
        int initialNum=numToArray(arr);
        int result=initialNum+addNum;
        // new array
        int[] newArr=new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            newArr[i]=result%10;
            result=result/10;
        }
        return newArr;
    }
    static int numToArray(int[] arr){
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num=num*10+arr[i];
        }
        return num;
    }
}
