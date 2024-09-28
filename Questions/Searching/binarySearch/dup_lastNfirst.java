package Questions.Searching.binarySearch;

public class dup_lastNfirst {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5};
        int target=3;
        int[] res=searchFL(arr, target);
        System.out.println(res[0]+" and "+res[1]);   
    }
    

    static int[] searchFL(int[] arr,int target){
        // the ready made answer if its not found then, i.e {-1,-1};
        int[] ans={-1,-1};

        int start=serach(arr, target, true);
        int end=serach(arr, target,false);
        ans[0]=start;
        ans[1]=end;

        return ans;

    }
     
    static int serach(int[] arr,int target,boolean firstIndex){
        //potential ans =-1;
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                ans =mid;
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
