// 1295. Find Numbers with Even Number of Digits
package Questions.Searching.linearSearch;
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={1,12,3333,12};
        int res=evenDigits(arr);
        System.out.println(res);
        
        
    }
    static int evenDigits(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            //here we are using String.valueOf(arr[i]) is used to convert the integer to a string, and then length() is used to find the number of digits in that string.
            if (String.valueOf(arr[i]).length() % 2 == 0) {
                count=count+1;

            }
        }
        return count;
    }
    
}
