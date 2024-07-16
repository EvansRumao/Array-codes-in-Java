import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
         int [] Arr1=Arrayutility.inputArray();
        int[] Arr2=Arrayutility.inputArray();
        boolean B=Compare.compare(Arr1,Arr2);
        if(B){
            System.out.println("the Array is same");
        }else {
            System.out.println("the Array is different");
        }
        
            

    }
    public static boolean compare(int[] arr1,int[]arr2)
    {
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==arr2[i])
            {
              count++;
            }
        }
        if(count== arr1.length)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
