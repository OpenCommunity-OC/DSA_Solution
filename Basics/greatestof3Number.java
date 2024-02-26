package Basics;

public class greatestof3Number {
    public static void main(String[] args) {
        int firstNum=10;
        int secondNum=100;
        int thirdNum=799;

        if (firstNum>secondNum && firstNum>thirdNum) {
            System.out.println("The greatest number is: "+firstNum);
        }
        else if (secondNum>firstNum && secondNum>thirdNum) {
            System.out.println("The greatest number is: "+secondNum); 
        }
        else{
            System.out.println("The greaest number is: "+thirdNum);
        }
    }
    
}
