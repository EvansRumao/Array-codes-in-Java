import java.util.Scanner;

// Utility class for performing common array operations
public class Arrayutility {

    // Method to take input for a 1D array
    public static int[] inputArray() {

        // Ask the user for the size of the array
        System.out.print("Enter the length of the array = ");

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();

        // Create an integer array of size n
        int[] arr = new int[n];

        // Ask user to enter array elements
        System.out.print("Enter the array elements = ");

        // Take input for each array element
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Return the input array
        return arr;
    }

    // Method to display elements of a 1D array
    public static int[] displayArray(int[] Arr) {

        // Traverse the entire array
        for (int i = 0; i < Arr.length; i++) {

            // Print each element
            System.out.print(Arr[i] + " ");
        }

        // Return the array
        return Arr;
    }

    // Method to sort an array using Bubble Sort
    public static int[] sorting(int[] Arr) {

        int temp;

        // Outer loop controls the number of passes
        for (int i = 0; i < Arr.length; i++) {

            // Inner loop compares adjacent elements
            for (int j = 0; j < Arr.length - i - 1; j++) {

                // If the current element is greater than
                // the next element, swap them
                if (Arr[j + 1] < Arr[j]) {

                    // Store current element temporarily
                    temp = Arr[j];

                    // Move smaller element to the left
                    Arr[j] = Arr[j + 1];

                    // Move larger element to the right
                    Arr[j + 1] = temp;
                }
            }
        }

        // Return the sorted array
        return Arr;
    }

    // Method to take input for a 2D array
    public static int[][] twoDimInput(int m, int n) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Create a 2D array with m rows and n columns
        int[][] Arr = new int[m][n];

        System.out.println("Enter the 2D Array = ");

        // Loop through rows
        for (int i = 0; i < m; i++) {

            // Loop through columns
            for (int j = 0; j < n; j++) {

                // Ask user for each element
                System.out.printf(
                    "Enter the Element at %d,%d = ",
                    i + 1, j + 1
                );

                // Store input in the 2D array
                Arr[i][j] = sc.nextInt();
            }
        }

        // Return the 2D array
        return Arr;
    }

    // Method to display a 2D array
    public static void twoDimOutput(int[][] arr, int m, int n) {

        System.out.println("The array = ");

        // Loop through rows
        for (int i = 0; i < m; i++) {

            // Loop through columns
            for (int j = 0; j < n; j++) {

                // Print each element
                System.out.print(" " + arr[i][j] + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
