package Questions.array;

import java.util.Arrays;

// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true]
public class candiesProblem {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        int n=3;
        boolean[] res=new boolean[arr.length];
        res=candies(arr, n);
        System.out.println(Arrays.toString(res));
    }
    
    static boolean[] candies(int[] arr, int n){
        int max=greatestArray(arr);
        boolean[] ans=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]+n>=max) {
                ans[i]=true;
            }else{
                ans[i]=false;
            }
        }
        return ans;
    
    }

    static int greatestArray(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }   
}

