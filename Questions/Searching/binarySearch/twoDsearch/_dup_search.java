package Questions.Searching.binarySearch.twoDsearch;

public class _dup_search {
    public static void main(String[] args) {
                 int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,48,50}
            };
            int target = 37;
            int[] res = search(arr, target);
            System.out.println(res[0] + " " + res[1]);
        }
    static int[] search(int[][] arr, int target){
        int r=0;
        int c=arr[0].length-1;

        while (r<arr.length && c>=0) {
            if (arr[r][c]==target) {                
             return new int[]{r,c};
            }
            else if (arr[r][c]>target) {
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
    }

