//Reverse the String
import java.util.*;
public class EasyReverse {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String rev="";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            rev=c+rev;
        }
        System.out.println(rev);
    }
}

