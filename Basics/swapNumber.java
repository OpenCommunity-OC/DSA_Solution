package Basics;

public class swapNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println("Before swapping a= "+arr[0]+" b= "+arr[1]);
        swap(arr,0, 1);
        System.out.println("After swapping a= "+arr[0]+" b= "+arr[1]);
    }
    static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
// NOTE: if the eturn type is void, then just call the function without storing anywhere  
// if the return type is int, then call the function and store the result in a variable

//Note: with array we can modify in selfDefined FUnction, since are no[t changing the refrence of this, whereas in normal integer value the gets changed ]

