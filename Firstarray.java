import java.util.Scanner;

public class Firstarray {
    public static void main(String[] args) {
        System.out.print("enter the lenght of the array=");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int [n];
        System.out.print("enter the elements of the array =");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.print("enter the elements u want to find=");
        int num1= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(num1==arr[i])
            {
                System.out.print("the element is at the position "+(i+1));
            }

        }

    }
}

import java.util.Scanner;

public class Firstarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the length of the array: ");
        int[] arr = new int[sc.nextInt()];

        // Read array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the element to search
        System.out.print("Enter the element you want to find: ");
        int target = sc.nextInt();

        // Search for the element
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break; // Stop searching once found
            }
        }

        // If element is not found
        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
