package searching.binarySearch;

public class structure {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=8;
        int res=binarySearch(arr,target);
        System.out.println(res);
    }

    static int binarySearch(int arr[], int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;//this expression is given,for the special scnario suppose the int exceeds its limit for the value in te traditional approcah then this is the expression i.e mid=start+(end -start)/2.... simply the mor optimized one

            if(target<arr[mid]){//checks here if the target is less than the middle element
                end=mid-1;
            }
            else if(target>arr[mid]){//checks here if the target is Greater than the middle element
                start=mid+1;
            }
            else{
               return mid; 
            }
        }
        return -1;
    }
}
