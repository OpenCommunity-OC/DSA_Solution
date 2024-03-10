package Questions.Searching.binarySearch;

public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=14;
        int res=ceilOfNum(arr, target);
        System.out.println(res);
        
    }
    static int ceilOfNum(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }            
        }
        return start;

    }
    
}
