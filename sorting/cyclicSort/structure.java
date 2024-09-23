package sorting.cyclicSort;

import java.util.Arrays;

public class structure {
    public static void main(String[] args) {
        int[] arr = {1,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] == arr[correct]) { // 1 is not equal to 1
                i++;
            } else {
                swap(arr, i, correct);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}