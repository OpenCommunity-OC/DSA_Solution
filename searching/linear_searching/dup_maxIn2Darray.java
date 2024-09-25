package searching.linear_searching;

public class dup_maxIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
        };
        int max=maxArray(arr);
        System.out.println("Maximum element in the array is: "+max);

    }
    static int maxArray(int[][] arr){
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
