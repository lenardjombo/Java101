import java.util.Arrays; // Import for utility class Arrays (for toString method)

public class ArrayOperations {
    public static void main(String[] args) {
        long[] arr = new long[100];
        arr[0] = 59;
        arr[1] = 12;
        arr[2] = 98;
        arr[3] = 10;
        arr[4] = 34;
        arr[5] = 74;
        arr[6] = 92;
        arr[7] = 11;
        int nElem = 8;

        // Displaying values in array
        System.out.println("Displaying items in Arrays");
        System.out.println("_______________________");
        for (int val = 0; val < nElem; val++) {
            System.out.print(arr[val] + " ");
        }
        System.out.println();
        System.out.println("_______________________");

        // Searching for a key
        long searchKey = 99;
        boolean found = false;
        System.out.println("Searching in Arrays");
        for (int i = 0; i < nElem; i++) {
            if (arr[i] == searchKey) {
                found = true;
                System.out.println("Found key " + searchKey);
                break;
            }
        }
        if (!found) {
            System.out.println("Can't find that key");
        }
        System.out.println("_______________________");

        // Deleting an array element
        int removeIndex = 1; // Index to remove
        if (removeIndex >= 0 && removeIndex < nElem) {
            for (int i = removeIndex; i < nElem - 1; i++) {
                arr[i] = arr[i + 1];
            }
            nElem--; // Decreased the number of elements
        }

        // Displaying the updated array after deletion
        System.out.println("The updated array after deletion is: " + Arrays.toString(Arrays.copyOf(arr, nElem)));
    }
}
