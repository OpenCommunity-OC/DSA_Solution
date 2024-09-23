public class findDuplicateArray {
    // 0,1,2,3,4
    // 1,3,4,2,2
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2};
        int res=findDuplicate(arr);
        System.out.println(res);
    }


    static int findDuplicate(int[] arr){
        int i=0;
        while (i<arr.length){
            if (arr[i]!=i+1) {  // 1 is not equal to 1
                int correct=arr[i]-1;
                if (arr[i]!=arr[correct]){
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
