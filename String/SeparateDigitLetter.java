//show firt digit and alphabets
package String;
import java.util.*;
public class SeparateDigitLetter {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String d="",stCap="",st="";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c)) 
            {
                d=d+c;
            }
            else if(Character.isUpperCase(c))
            {
                stCap=stCap+c;
            }
            else
            {
                st=st+c;
            }
        }
        System.out.println(d+stCap+st);
    }
}
