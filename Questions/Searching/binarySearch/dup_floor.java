package Questions.Searching.binarySearch;

public class dup_floor {
    public static void main(String[] args) {
        int[] arr={1,2,4};
        int target=3;
        int res=floor(arr, target);
        System.out.println(res);
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
