package searching.linear_searching;

public class dup_richestWealth {
    public static void main(String[] args) {
        int[][] accounts = {
        {1,5},
        {7,3},
        {3,8},  
        {9,9}
        };
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] accounts){
        int size=accounts.length;
        int[] arr=new int[size];
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum=sum+accounts[i][j];
            }
            arr[i]=sum;
        }
        int res=maxOfArray(arr);
        return res;
       
    }
    static int maxOfArray(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
