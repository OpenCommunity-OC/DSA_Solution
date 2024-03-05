package Array_ArrayList;
import java.util.Scanner;
public class inputOfArray {
    public static void main(String[] args) {
      int[] arr=new int[4];
   
      //taking in as input from scanner class
      Scanner sc=new Scanner(System.in);
      //via for loop
      for (int i = 0; i < arr.length; i++) {
        System.out.print("Enter the elements");
        arr[i]=sc.nextInt();
      }
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      }
      //via foreach
      for (int i : arr) {
        System.out.println("from for each"+arr[i]);
      }

    }
}
