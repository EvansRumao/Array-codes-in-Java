import java.util.Scanner;

public class Compare {

    // Main method - Program execution starts here
    public static void main(String[] args) {

        // Take first array input from the user
        int[] Arr1 = Arrayutility.inputArray();

        // Take second array input from the user
        int[] Arr2 = Arrayutility.inputArray();

        // Call the compare method to check if both arrays are the same
        boolean B = Compare.compare(Arr1, Arr2);

        // Display the result based on the returned value
        if (B) {
            System.out.println("The Array is same");
        } else {
            System.out.println("The Array is different");
        }
    }

    // Method to compare two integer arrays
    public static boolean compare(int[] arr1, int[] arr2) {

        // Variable to count matching elements
        int count = 0;

        // Loop through each element of the arrays
        for (int i = 0; i < arr1.length; i++) {

            // Check if elements at the same index are equal
            if (arr1[i] == arr2[i]) {
                count++; // Increment count if elements match
            }
        }

        // If all elements matched, arrays are identical
        if (count == arr1.length) {
            return true;
        } else {
            // Otherwise, arrays are different
            return false;
        }
    }
}
