import java.util.ArrayList;
import java.util.List;
// 0,1,2,3,4,5,6,7
// 1,2,3,4,3,2,7,8
// 4,3,2,7,8,2,3,1

public class findDuplicateNumber {
    
    public static void main(String[] args) {
        int[] arr = {1};
        findAllMissing findAllMissing = new findAllMissing();
        List<Integer> missingNumbers = findAllMissing.findDisappearedNumbers(arr);
        System.out.println("Missing numbers: " + missingNumbers);
    }

   public List<Integer> findDuplicates(int[] arr) {
    int i=0;
    while (i<arr.length){
        int corect=arr[i]-1;
        if (arr[i]!=arr[corect]){
            swap(arr, i, corect);
        }
        else{
            i++;
        }
    }
         List<Integer> ans=new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]!= j+1){
                    ans.add(arr[j]);
                  }
              }
        return ans;

    }

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
