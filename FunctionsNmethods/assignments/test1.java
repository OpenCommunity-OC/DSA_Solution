//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package FunctionsNmethods.assignments;

public class test1 {
    public static void main(String[] args) {
        max(1,2,3);
        min(1,2,3);

    //     3 is greatest
    //     1 is lowest
    //    21 is greatest
    }
    static void max(int a, int b, int c){
        if (a>b && a>c) {
           System.out.println(a+" is graetest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is graetest");
        }
        else{
            System.out.println(c+" is greatest");
        }
    }

    static void min(int a, int b, int c){
        if (a<b && a<c) {
           System.out.println(a+" is lowest");
        }
        else if(b<a && b<c){
            System.out.println(b+" is lowest");
        }
        else{
            System.out.println(c+" is lowest");
        }
    }
    
}
