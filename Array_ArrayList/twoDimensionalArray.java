package Array_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        //2D array is represented as: 
        // first method
        // int[][] arr=new int[row][col];
        //here row size have to be giben compulsory wheres column is not... since column may be of du=ynamic range size

        // exapmle int arr[][]=
                                // {
                                //     {1,2,3},
                                //     {4,5},
                                //     {7,8,9}
                                // };
    
        // second method
        //int[][] arr={{1,2,3},{4,5,6},{7}}                                

        //taking an input from 2D array
        //getting scanner class
        Scanner in=new Scanner(System.in);

        int [][] arr=new int [3][3];


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        
        //here i am using Arrays.toString method to get the output and reduce the time 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        //output
        /*
         1 2 3 4 5 6 7 8 9
            [1, 2, 3]
            [4, 5, 6]
            [7, 8, 9]
         */

         //now printing dynamic output
         int[][] arr2={
            {1,2,3},
            {4,5},
            {6,5,6,7,8}
         };


         for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col]);
            }
            System.out.println();//adding an line break1
         }


    }
    
}
