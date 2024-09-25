package Basics;

public class maxInArrayElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};//4
        int res=maxElement(arr);
        System.out.println(res);
    }
    static int maxElement(int[] arr){
        // here we will crate a variable and we will be storing the first element of an array
        // {1,2,3};
        // first element i.e arr[0]=1
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    
}
