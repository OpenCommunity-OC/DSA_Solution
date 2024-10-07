package Basics;

public class getDuplicate {
    public static void main(String[] args) {
    int[] arr={1,1,2,3,3};    
    int duplicate=getDuplicate(arr);
    System.out.println("Duplicate element is "+duplicate);
    }
    static int getDuplicate(int[] arr){
        int count=0;
        for (int i =  0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
