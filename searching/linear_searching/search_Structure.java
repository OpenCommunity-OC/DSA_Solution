package searching.linear_searching;

public class search_Structure {
    public static void main(String[] args) {
     int[] arr={1,2,3,4};
     //search whether the element 2 is available in the arr array or not
     //logic
     int target=2;//target value is 2
     for (int i = 0; i < arr.length; i++) {
        if(arr[i]==target){
            System.out.println("Element found at: "+i);
        }
     }
    }
}
