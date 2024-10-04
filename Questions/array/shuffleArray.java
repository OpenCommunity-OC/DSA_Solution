package Questions.array;
// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

import java.util.Arrays;

public class shuffleArray {
public static void main(String[] args) {
    int[] arr={2,5,1,3,4,7};
    int n=3;
    int[] res=new int[arr.length];
    res=shuffle(arr,3);
    System.out.println(Arrays.toString(res));
}   
    static int[] shuffle(int[] arr, int n){
        int[] res=new int[arr.length];
        int count=0;
        for (int i = 0; i < n; i++) {
            res[count]=arr[i];
            res[count+1]=arr[n+i];
            count=count+2;
        }
        return res;
    }
}
