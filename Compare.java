import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
