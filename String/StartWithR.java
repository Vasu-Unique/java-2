//Print only the words starting with R in a sentence
//Print only the words ending with ED in a sentence
package String;
import java.util.*;
public class StartWithR {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String w="";

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(c!=' ')
            {
                w+=c;
            }
            else
            {
                if(w.startsWith("R")) //w.endsWith("ED")
                {
                    System.out.println(w);
                }
                w="";
            }
        }
    }
    
}
