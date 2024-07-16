import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the array=");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array elements=");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the elements u want to find=");
        int m = sc.nextInt();
        int y=occur(arr,m);
        System.out.println("the  number of times ="+y);


    }
    public static int occur(int []arr,int m)
    {

        int count =0;
        for (int i = 0; i < arr.length; i++)
        {
            if(m==arr[i])
            {
                count++;
            }

        }
        return count;

    }
}
