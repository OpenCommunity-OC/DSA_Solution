package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class numberToArray {
    public static void main(String[] args) {
        int num=1001;
        int res[]=toArray(num);
        System.out.println(Arrays.toString(res));
    }
    // main Function, converting num to array
    static int[] toArray(int num){
        int len=size(num);
        int[] arr=new int[len];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i]=num%10;
            num=num/10;
        }
        return arr;
    }
    //getting length of number
    static int size(int num){
        int count=0;
        while (num>0) {
            num=num/10;
            count++;
        }
        return count;
    }
}