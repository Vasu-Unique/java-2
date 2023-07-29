//Reverse the String
package String;
import java.util.*;
public class Palindrome {
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
        if(s.equalsIgnoreCase(rev))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
