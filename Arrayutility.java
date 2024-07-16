import java.util.Scanner;

public class Arrayutility {
    public  static int []inputArray() {
        System.out.print("enter the length of the array =");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int [n];
        System.out.print("enter the array elements =");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
      return arr;
    }
public static int [] displayArray(int []Arr){
        for(int i=0;i< Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        return Arr;
}
public static int [] sorting(int []Arr){
        int temp;
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j< Arr.length-i-1;j++){
               if(Arr[j+1]<Arr[j])
               {
                   temp = Arr[j];
                   Arr[j]=Arr[j+1];
                   Arr[j+1]=temp;
               }
            }

        }
        return Arr;
}
public static int [][] twoDimInput(int m,int n){
    Scanner sc = new Scanner(System.in);
    int [][] Arr= new int[m][n];
    System.out.println("enter the 2DArray=");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.printf("enter the Element at %d,%d=",i+1,j+1);
            Arr[i][j]= sc.nextInt();
        }
    }
    return Arr;
}
public static void twoDimOutput(int [][]arr,int m,int n){
        System.out.println("the array =");

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
