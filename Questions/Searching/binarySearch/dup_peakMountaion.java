package Questions.Searching.binarySearch;

public class dup_peakMountaion {
    public static void main(String[] args) {
        int[] arr={24,69,100,99,79,78,67,36,26,19};
        int peak = peakMountaion(arr);
        System.out.println(peak);
    }
    static int tar(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    //Binary Search
    // static int peakMountaion(int[] arr){
    //     int target=tar(arr);
    //     int start=0;
    //     int end=arr.length-1;
    //     while (start<=end) {
    //         int mid=start+(end-start)/2;
    //         if (target<arr[mid]) {
    //             end=mid-1;
    //         }
    //         else if(target>arr[mid]){
    //             start=mid+1;
    //         }
    //         else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }

    //LinearSearch
    static int peakMountaion(int[] arr){
        int target=tar(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
