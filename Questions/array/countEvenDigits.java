package Questions.array;
// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.
public class countEvenDigits {
    public static void main(String[] args) {
        int[] arr={22,1,44,5555};
        int res=findNumber(arr);
        System.out.println(res);
    }
    static int findNumber(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (countDigit(arr[i])%2==0) {
                count++;
            }
        }
        return count;
    }
    static int countDigit(int num){
        int count=0;
        while (num>0){
            num=num/10;
            count++;
        }
        return count;
    }
}
