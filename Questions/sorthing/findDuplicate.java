package Questions.sorthing;
// Input: nums = [1,3,4,2,2]
// Output
public class findDuplicate{
  public static void main(String[] args) {
    int[] arr={1,3,4,2,2};
    //         0,1,2,3,4
    int res=duplicate(arr);
    System.out.println(res); 
  }
    static int duplicate(int[] arr){
        int i=0;
        while (arr[i]<arr.length){
            if (arr[i]!=i+1){ //3 is not equal to 2
                int correct=arr[i]-1;
                if (arr[i]!=arr[correct]){ // 1 is not equal to 0
                    swap(arr, i, correct);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}


