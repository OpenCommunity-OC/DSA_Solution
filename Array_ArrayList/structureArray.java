package Array_ArrayList;

public class structureArray {
    public static void main(String[] args) {
        //Array are used to store multiple collection/element/dataType in a single variable
        //syntax: 
        //First method
        // int[] arr=new int[size of an array];
        //second method (dirsect initialisation) 
        //syntax: int [] arr={1,2,3,4,5};

        //how array is stores inside heap memory
        int [] arr;//decleration phase
        arr=new int[5];//initialisation phase (here space/memory is created inside heap memory)

        //if we dont initialisation an array :: reamains empty then
        //of integer
        System.out.println(arr[1]+" "+arr[2]);//returns 0 
        //of float
        float[] arr2 = new float[2];
        System.out.println(arr2[0]+" "+arr2[1]);//returns 0.0 0.0
        //of string
        String[] arr3=new String[2];
        System.out.println(arr3[0]+" "+arr3[1]);//returns null null
    }
    
}
