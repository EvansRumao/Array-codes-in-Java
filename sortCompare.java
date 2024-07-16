import java.util.Scanner;

public class sortCompare {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        int [] Arr=Arrayutility.inputArray();
        int []arr1= new int[Arr.length];
        for(int i=0;i<Arr.length;i++)
        {
            arr1[i]=Arr[i];
        }
        int y=comp(Arr,arr1);
        if(y==Arr.length)
        {
            System.out.println("the array is sorted in ascending order");
        }
        else
        {
            System.out.println("the array is not sorted in ascending order");
        }
    }
    public static int comp(int []arr,int []arr1){
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if (arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        int b=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr1[i])
            {
                b++;
            }
        }
        return b;

    }

}
