//Print each word of a sentence in a separate line
package String;
import java.util.*;
public class SplitSpace {
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        String n=obj.nextLine();
        String w="";
        n+=" ";

        for(int i=0;i<n.length();i++)
        {
            char c=n.charAt(i);
            if(c!=' ')
            {
                w=w+c;
            }
            else
            {
                System.out.println(w);
                w=""; 
            }
        }
       // System.out.println(w);

    }
}
