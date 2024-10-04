package Basics;

public class countDigitInANumber {
    public static void main(String[] args) {
        int num=1029384756;
        int res=countDigit(num);   
        System.out.println(res);     
    }
    static int countDigit(int num){
        int count=0;
        while (num>0) {
            num/=10;
            count++;
        }
        return count;
    }
}
