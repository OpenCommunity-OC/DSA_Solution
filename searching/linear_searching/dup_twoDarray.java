package searching.linear_searching;

public class dup_twoDarray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        int taget=10;
        int res[]=two_D_array(arr  , taget);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
    static int[] two_D_array(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }   
}
