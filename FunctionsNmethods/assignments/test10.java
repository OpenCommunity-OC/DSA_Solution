package FunctionsNmethods.assignments;

public class test10 {
    public static void main(String[] args) {
        sumNaturalnumber(12);
    }
    
    static void sumNaturalnumber(int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum +i;
        }
        System.out.println("The sum of "+n+" are: "+sum);
    }
    
}
