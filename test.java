public class test {
    public static void main(String[] args) {
        firstLoop();
    }
    static int firstLoop(){
        return secondLoop();
    }

    static int secondLoop(){
        try {
            return 1/0;
            
        } catch (ArithmeticException e) {
            System.err.println("error");
            return 0;
        }
    }
    
}
