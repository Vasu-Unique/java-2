//To find largest word in a String  
package String;
import java.util.*;
public class LongestWord {
    public static void Main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        String a=obj.nextLine();
        String w="";
        String lw="";
        a=a+" ";


        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(c!=' ')
            {
                w=w+c;
            }
            else
            {
                if(w.length()>lw.length())
                {
                    lw=w;
                }
                w="";
            }
        }
        System.out.println(lw);
    }
}
