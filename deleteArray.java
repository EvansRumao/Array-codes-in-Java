import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {
        int[]Arr=Arrayutility.inputArray();
        System.out.print("enter the elements u want to remove =");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int []newArr=deleteArray(Arr,num);
        System.out.print("the array =");
        Arrayutility.displayArray(newArr);


    }
    public static int[] deleteArray(int []Arr,int num){

        int m=occurence.occur(Arr,num);
        if(num==0)
        {
            return Arr;
        }
        int newSize=Arr.length-m;
        int [] newArr=new int[newSize];
        for(int i=0,j=0;i< Arr.length;i++)
        {
            if(Arr[i]!=num)
            {
                newArr[j]=Arr[i];
                j++;
            }

        }
        return newArr;
    }
}
