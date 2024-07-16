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
