// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package FunctionsNmethods.assignments;

public class test3 {
    public static void main(String[] args) {
        voteElegb("vicky",2);
    }
    static void  voteElegb(String name,int age){
        if (age>=18){
            System.out.println(name+" is Eligible to vote");
        }
        else{
            System.out.println(name+" is not Eligible to vote");
        }
    }
    
}
