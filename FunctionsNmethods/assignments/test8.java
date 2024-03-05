//reverse a digit
package FunctionsNmethods.assignments;

public class test8 {
    public static void main(String[] args) {
        reverse(678);
    }
    static void reverse(int n){
        while (n>0) {
            int rem=n%10;
            System.out.print(rem);
            n=n/10;
        }
    }
    
}
