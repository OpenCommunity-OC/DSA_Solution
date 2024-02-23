package Basics;

public class nestedMultiplicationCondition {
    public static void main(String[] args) {
        //manually specify the Range
        int range=100;

        for ( int i=range ; i <=range+20; i++) {
            for (int j = 0; j <=12; j++) {
                System.out.println(i+"X"+j+"="+i*j);
            }
            
        }
        
    }
    
}
