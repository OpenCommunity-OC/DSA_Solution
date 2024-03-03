package FunctionsNmethods;

import java.util.Scanner;

public class voidReturnType {
    public static void main(String[] args) {
        // add();
        // sub();
        // mul();
        // div();

        //greet operations
        String name ="vicky";
        greet(name);
    }
    static void add(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the fist number");
        int num1=sc.nextInt();

        System.out.print("Enter the second number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println("The addition of two number is: "+res);
    }

    static void sub(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the fist number");
        int num1=sc.nextInt();

        System.out.print("Enter the second number");
        int num2=sc.nextInt();

        int res=num1-num2;

        System.out.println("The subsstraction of two number is: "+res);
    }

    static void mul(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the fist number");
        int num1=sc.nextInt();

        System.out.print("Enter the second number");
        int num2=sc.nextInt();

        int res=num1*num2;

        System.out.println("The Multiplication of two number is: "+res);
    }
    static void div(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the fist number");
        int num1=sc.nextInt();

        System.out.print("Enter the second number");
        int num2=sc.nextInt();

        int res=num1/num2;

        System.out.println("The division of two number is: "+res);
    }

    static void greet(String name){
        System.out.println("Hey there, "+name);
    }
}
