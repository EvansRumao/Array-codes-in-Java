import java.util.Scanner;

public class sumAverage {
    public static void main(String[] args) {
        System.out.print("enter the length of the array=");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the elements of the array =");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int sum =0;
        for (int i=0;i<n;i++)
        {
            sum +=arr[i];
        }
        int avg=sum/n;
        System.out.println("the sum of the elements ="+sum);
        System.out.println("the average ="+avg);
    }
}
