package searching.linear_searching;

public class dup_EveneDigits {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6,2,3},
            {7,8,9,1},
            {10,11,12,1,1,1},
            {1,2}
        };
        int res=finEvenNum(arr);
        System.out.println(res);
    }
    static int finEvenNum(int[][] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length%2==0) {
                count++;
            }
            }
            return count;
        }
    }

