package Questions.Searching.binarySearch.twoDsearch;

public class _dup_2DMartix {
    public static void main(String[] args) {
    int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}
             };
    int target=9;             
    int[] res= searchMatrix(arr,target);
    System.out.println("Element found at index: "+res[0]+" "+res[1]);

    }
    static int[] searchMatrix(int[][] arr, int target){
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
