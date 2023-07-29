//Create a new String after removing all Spaces in a String
package String;
import java.util.*;
public class RemoveSpace {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String st="";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!Character.isWhitespace(c))
            {
                st=st+c;
            }
        }
    }
}
