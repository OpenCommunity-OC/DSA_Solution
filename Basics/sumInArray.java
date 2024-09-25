package Basics;

public class sumInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int res=sum(array);
        System.out.println(res);
    }
    static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    
}
