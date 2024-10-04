package Basics;

public class numberLength {
    public static void main(String[] args) {
        int n=1001;
        System.out.println(size(n)); //4
    }
    static int size(int num){
        int count=0;
        while (num>0) {
            num=num/10;
            count++;
        }
        return count;
    }
}
    

