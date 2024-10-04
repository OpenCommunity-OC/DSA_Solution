package Basics;

public class convert_oneDarray_twoDarray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        

    }
    static int toOneDimension(int[][] arr){
        // new array size and declaration.
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
            }
        }
        int newArr= new int[count];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[i]=arr[i][j];
            }
        }
    }
}
