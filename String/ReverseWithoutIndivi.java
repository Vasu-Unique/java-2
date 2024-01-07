package String;
import java.util.*;
public class ReverseWithoutIndivi {
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        a=a+".";
        String w="",s="";

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(c!='.')
            {
                w=w+c;
            }
            else
            {
                s="."+w+s;
                w="";
            }
        }
        System.out.println(s.substring(1,s.length()));
}
}