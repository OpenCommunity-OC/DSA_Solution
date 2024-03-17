
// Note: This opeartion is to only apply if the matrix is sorted at ROW wise and COlumn wise
package Questions.Searching.binarySearch.twoDsearch;
import java.util.Arrays;

public class algorithm {
    public static void main(String[] args) {
     int[][] matrix={
        {10,20,30,40},
        {15,25,35,45},
        {28,29,37,49},
        {33,34,38,50}
     };
     int target=44;
     System.out.println(Arrays.toString(twoDarray(matrix, target)));
    }
    static int[] twoDarray(int[][] matrix, int target){
        int row=0;
        int col=matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
