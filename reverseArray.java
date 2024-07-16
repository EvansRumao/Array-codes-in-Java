import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] Arr=Arrayutility.inputArray();
        int [] rev=reverseArray(Arr);
        Arrayutility.displayArray(rev);
    }
    public static int [] reverseArray(int []Arr){
        int [] arr=new int[Arr.length];

            for(int i=0,j= Arr.length-1;i< Arr.length;i++,j--)
            {
                arr[i]=Arr[j];

            }
            return arr;


    }

}
