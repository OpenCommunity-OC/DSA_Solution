package searching.linear_searching;

public class dup_EvenDigitsSingle {
    public static void main(String[] args) {
        int[] arr={1,22,333,4444,22};
        int res=evenDigit(arr);
        System.out.println(res);
    }
    static int countDigit(int num){
        int count=0;
        while (num>0) {
            num=num/10;
            count++;
        }
        return count;
    }
    static int evenDigit(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (countDigit(arr[i])%2==0) {
                count++;
            }
        }
        return count;
    }
}
