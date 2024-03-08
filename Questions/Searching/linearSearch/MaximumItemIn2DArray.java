package Questions.Searching.linearSearch;

public class MaximumItemIn2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9,100}};
        int res=maxItem(arr);
        System.out.println(res);

    }

    static int maxItem(int[][]arr){
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            
        }
        return max;
    }
    
}
