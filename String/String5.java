//Create a new String containing only uppercase characters
package String;
import java.util.Scanner;
public class String5 {
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
                st=st+c;
            }
        }
    }
}
