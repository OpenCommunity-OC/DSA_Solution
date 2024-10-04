package Questions.array;
// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
public class goodPair {
    public static void main(String[] args) {
        // int[] arr={1,2,3,1,1,3};
        // int[] arr={1,1,1,1};
        int[] arr={1,2,3};
        

        int count=goodPair(arr);
        System.out.println(count);
      ;  
    }
    static int goodPair(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                        count++;
                }
            }
        }
        return count;
    }
    
}
