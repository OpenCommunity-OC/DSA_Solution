package FunctionsNmethods;

public class intReturnType {
    public static void main(String[] args) {
        //basic program to sum of two number
        int result= add(1,2);
        System.out.println(result);
    }

    //passed value with return type of integer
    static int add(int a,int b){
        int res=a+b;
        return res;
    }

}
