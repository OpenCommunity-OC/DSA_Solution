import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllMissing {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        findAllMissing findAllMissing = new findAllMissing();
        List<Integer> missingNumbers = findAllMissing.findDisappearedNumbers(arr);
        System.out.println("Missing numbers: " + missingNumbers);
    }
    public List<Integer> findDisappearedNumbers(int[] arr){
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

        // add the arrayList
        List<Integer> ans=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!= j+1){
                ans.add(j+1);
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
