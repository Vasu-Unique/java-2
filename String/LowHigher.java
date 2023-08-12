//Write a program Uppercae To lowerCase String
package String;
import java.util.*;
public class LowHigher {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String st="";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c)) 
            {
                st=st+Character.toLowerCase(c);
            }
            else{
                st=st+Character.toUpperCase(c);
            }
        }
        System.out.println(st);
    }
}
