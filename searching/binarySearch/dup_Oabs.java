package searching.binarySearch;

public class dup_Oabs {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        int target=2;
        int res=orderAgnosticeBS(arr, target);
        System.out.println(res);
        
    }
    static int orderAgnosticeBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        // checking the array is sorted or not
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if (isAsc) {
                if (target<arr[mid]) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if (target>arr[mid]) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    
}
