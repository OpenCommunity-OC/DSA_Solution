package Basics;

public class printSkipArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,10};

        //Adjust for skip number 
        int skip=1;

        for (int i = 0; i < arr.length; i=i+1+skip) {
            System.out.println(arr[i]);
        }
    }
    
}
