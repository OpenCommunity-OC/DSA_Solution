package Basics;

public class MinElement {
    public static void main(String[] args) {
        int[] arr={-1,1,2,3,-10};
        int res=minElement(arr);
        System.out.println(res);
    }

    static int minElement(int[] arr){
        int minValue=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minValue){
                minValue=arr[i];
            }
        }
        return minValue;
    }
}
