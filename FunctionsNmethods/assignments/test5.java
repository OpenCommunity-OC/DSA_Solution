package FunctionsNmethods.assignments;

public class test5 {
    public static void main(String[] args) {
        calcCircum(2);
    }

    static void calcCircum(int rad){
        float pi=3.14f;
        float circum=2*pi*rad;
        System.out.println("circumference of radius "+rad+" is "+circum);
    }
    
}
