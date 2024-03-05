// Write a program to print the factorial of a number by defining a method named 'Factorial'.
package FunctionsNmethods.assignments;

public class test7 {
    public static void main(String[] args) {
        factorial(4);
    }

    static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
    
    
}
