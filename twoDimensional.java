import java.util.Scanner;

public class twoDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows =");
        int m=sc.nextInt();
        System.out.print("enter the number of columns=");
        int n=sc.nextInt();
        int [][] arr=new int[m][n];
        System.out.println("enter the first 2DArray=");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int [][] arr1= new int[m][n];
        System.out.println("enter the first 2DArray=");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]= sc.nextInt();
            }
        }
        int [][] sum = new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("the array =");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+sum[i][j]+" ");
            }
            System.out.println();
        }

    }

}
