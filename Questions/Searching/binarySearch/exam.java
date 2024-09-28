package Questions.Searching.binarySearch;

public class exam {
    // Input: nums = [5,7,7,8,8,10], target = 8
    //Output: [3,4]
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8};
        int target=7;
        int res[]=FL_Search(arr, target);
        System.out.println(res[0]+" "+res[1]);
        
    }
    static int[] FL_Search(int[]arr, int target){
        int[] ans={-1,-1};
        ans[0]=eachSearch(arr, target, true);
        ans[1]=eachSearch(arr, target, false);
        return ans;
    }
    static int eachSearch(int[] arr,int target,boolean firstIndex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if (firstIndex) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
}
}

