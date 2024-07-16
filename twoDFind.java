import java.util.Scanner;

public class twoDFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows=");
        int m =sc.nextInt();
        System.out.print("enter the number of columns=");
        int n = sc.nextInt();
        int [][] Arr=Arrayutility.twoDimInput(m,n);
        System.out.print("enter the number u want to find =");
        int num1=sc.nextInt();
        boolean y =find(Arr,m,n,num1);
        if(y)
        {
            System.out.println("the element is found ");
        }
        else
        {
            System.out.println("element not found");
        }

    }
    public static boolean find(int [][]Arr,int m ,int n,int num1){
        for(int i=0;i<m;i++)
        { for (int j=0;j<n;j++)
        {
            if(Arr[i][j]==num1)
            {
                return true;
            }
        }

        }

        return false;
    }
}
