package Basics;

public class fibonacci {
    public static void main(String[] args) {
         int num1=0;
         int num2=1;
         int size=10;
         for(int i=0;i<size;i++){
            int next=num1+num2;
            System.out.println(next);
            num1=num2;
            num2=next;   
         }

    }
    
}
