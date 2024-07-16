import java.util.Scanner;

public class pllindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []Arr=Arrayutility.inputArray();
        boolean n=palindrome(Arr);
        if(n)
        {
            System.out.println("is palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

    }
    public static boolean palindrome(int [] Arr){
        int []newArray=reverseArray.reverseArray(Arr);
        boolean m=Compare.compare(Arr,newArray);
        return m;
    }
}
