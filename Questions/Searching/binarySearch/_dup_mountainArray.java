package Questions.Searching.binarySearch;

public class _dup_mountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        int ans=peakMountaion(arr,target);
        System.out.println(ans);
    }
    //This is the main method:
    static int peakMountaion(int[] arr, int target){
        int peak=peakIndex(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if(firstTry==-1){
            return firstTry;
        }
        else{
            return orderAgnosticBS(arr, target, peak+1, arr.length-1);
        }

    }
    //This method is for getting the peak index in an array
    static int peakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    // This metod is doing, for the order agnostic binary search
    static int orderAgnosticBS(int[] arr,int target, int start,int end){
       

        // if your start is less than the end then it is assme as ASCENDING
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid =start+(end-start)/2;

            if(arr[mid]==target){//checks if the middle ele is = target then return the middle element
                return mid;
            }
            if(isAsc){//if the condition is Ascending then it goes here
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{//if the condition is decsending then it goes here
                if(target>arr[mid]){
                    end =mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    
}
this will be the mstof the attta