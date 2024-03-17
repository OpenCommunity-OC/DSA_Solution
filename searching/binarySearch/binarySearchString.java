package searching.binarySearch;

public class binarySearchString {
    static String[] names = {"akash", "prince", "vicky"};

    public static int binaryInString(String[] names, String target) {
        int start = 0;
        int end = names.length - 1; // Corrected end value

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int cmp = target.compareTo(names[mid]); // Corrected comparison

            if (cmp < 0) {
                end = mid - 1;
            } else if (cmp > 0) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // Changed return type to int and return -1 for not found
    }

    public static void main(String[] args) {
        String target = "vicky";
        int index = binaryInString(names, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
