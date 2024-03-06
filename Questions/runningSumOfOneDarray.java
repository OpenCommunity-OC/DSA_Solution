package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class runningSumOfOneDarray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(arr));
        
    }

    static int[] run(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    
}
