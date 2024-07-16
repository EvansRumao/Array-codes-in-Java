import java.util.Scanner;

public class sumAverage2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows =");
        int m= sc.nextInt();
        System.out.print("enter the number of columns=");
        int n= sc.nextInt();
        int [][] Arr =Arrayutility.twoDimInput(m,n);
        int y=sumAver(Arr,m,n);
        int x=Diagonal(Arr,m,n);
        float Avg=y/(m*n);
        System.out.println("the sum ="+y+" the Average ="+Avg);
        System.out.println("the sum of diagonal elements ="+x);
    }
    public static int sumAver(int [][] Arr,int m,int n){
        int sum=0;
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum+=Arr[i][j];
            }
        }
        return sum;
    }
    public static int Diagonal(int [][]Arr,int m,int n)
    {
        int dSum =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j||i+j==m-1)
                {
                    dSum+=Arr[i][j];
                }
            }

        }
        return dSum;
    }
}
