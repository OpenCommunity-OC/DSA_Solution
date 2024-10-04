package Basics;

public class arrToNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int num=toNumber(arr);
        System.out.println(num);
    }
    static int toNumber(int[] arr){
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num=num*10+arr[i];
        }
        return num;
    }
    
}
