package searching.binarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        //order agnostic is given for the binary search which works on two way mode i.e ascending OR descending 
        int[] arr={1,2,3,4,5};//this is for ascending
        int[] arr2={10,9,8,7,6};//this is for descending
        int target=9;
        int res=orderAgnosticBS(arr2, target);
        System.out.println(res);
        
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

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
