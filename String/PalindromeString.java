package String;
import java.util.*;
public class PalindromeString {
    public static void main(String argr[])
    {
        Scanner obj=new Scanner (System.in);
        char arr[]=new Scanner (System.in).nextLine().toCharArray();
        String rev="";

        for(int i=0;i<arr.length;i++)
        {
            rev=arr[i]+rev;
        }
        System.out.println(rev);
        
        if(arr.equals(rev))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
