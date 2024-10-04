package Questions.array;

public class matrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int res=diagonalSum(matrix);
        System.out.println(res);

    }
    static int diagonalSum(int[][] matrix){
        int sum=0;
        // this is for row
        for (int i = 0; i < matrix.length; i++) {
        // this is for coulmn
        for (int j = matrix.length-1; j >=0; j--) {
            sum=sum+matrix[i][j-i+1];
         }    
      }
      return sum;
    }
    
}
