package Questions.Searching.linearSearch;

public class minimumElement {
    public static void main(String[] args) {
        int[] arr={10,2,3,4,5};
        int res=minimumElement(arr);
        System.out.println(res);
    }
    static int minimumElement(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    
}
