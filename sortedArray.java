import java.util.Scanner;

public class sortedArray {
    public static void main(String[] args) {
        int [] arr1=Arrayutility.inputArray();
        int [] Arr=Arrayutility.sorting(arr1);
        Scanner sc = new Scanner(System.in);
        int [] arr2=Arrayutility.inputArray();
        int [] Arr1=Arrayutility.sorting(arr2);
        int [] arr3 =sort(Arr,Arr1);
        System.out.println("the new array =");
        Arrayutility.displayArray(arr3);

    }
    public static int [] sort(int []arr1,int[] arr2)
    {
        int [] arr3 = new int[arr1.length+ arr2.length];
        for(int i=0,j=0,k=0;i< arr1.length||j< arr2.length;)
        {
            if(j== arr2.length||(i< arr1.length)&&arr1[i]<arr2[j])
            {
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                arr3[k]=arr2[j];
                j++;
                k++;

            }

        }
        return arr3;
    }

}
