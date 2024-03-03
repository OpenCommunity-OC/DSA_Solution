package FunctionsNmethods;

import java.util.Scanner;

public class methodOverLoading {
    public static void main(String[] args) {

        //Methodoverloading with different example
        add();//ex1
        add(2,3);//ex2
    }
    static void add(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number");
        int num=in.nextInt();

        System.out.println("enter the Second number");
        int num2=in.nextInt();

        int res=num+num2;

        System.out.println("The sum is: "+res);
    }

    static void add(int a, int b){
        int res=a+b;
        System.out.println(res);
    }
}
