//Create a new String containing only uppercase characters
package String;
import java.util.*;
public class FindLetter {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char u=Character.toUpperCase(c);
            if(u=='R') 
            {
               count++; 
            }
        }
        System.out.println(count);
    }
}
