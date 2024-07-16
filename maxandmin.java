import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of the array =");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.print("enter the elements of the array=");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int y=max(arr,n);
        int x=min(arr);
        System.out.println("the maximum="+y+" the minimum="+x);


    }
    public static int max(int []arr,int n){
        int max=arr[0];
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                max=arr[i+1];
            }
        }
        return max;
    }
    public static int min(int[]arr){
        int min=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i])
            {
                min=arr[i+1];
            }
        }
        return min;

    }
}
