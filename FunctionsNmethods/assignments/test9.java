//Write a function to find if a number is a palindrome or not. Take number as parameter.
package FunctionsNmethods.assignments;
public class test9 {
    public static void main(String[] args) {
        checkPalindrome(101);
    }

    static void checkPalindrome(int num){
        int originalValue=num;
        int sum=0;
        while (num>0) {
      
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println("The reverse didgit is"+sum);

        if (originalValue==sum) {
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not plaindrome");
        }
        
    }
    
}
