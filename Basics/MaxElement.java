package Basics;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int res=maxElement(arr);
        System.out.println(res);
    }

    static int maxElement(int[] arr){
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
