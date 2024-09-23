package Basics;

public class breakInnerLoop{
    public static void main(String[] args) {
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==1 && j==2){
                    break; //so after the test we came to know that each break statement breaks a single inner loop no all
                }
            }
        }
    }

}
