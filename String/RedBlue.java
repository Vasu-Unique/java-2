//Change RED with BLUE in a sentence and print it.
package String;
import java.util.*;
public class RedBlue {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        String a=obj.nextLine();
        String w="",ns="";
        a=a+" ";
        

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(c!=' ')
            {
                w+=c;
            }
            else
            {
                if(w.equals("red"))
                    ns=ns+"BLUE"+" ";
                else
                    ns=ns+w+" ";
                w="";
            }
        }
        System.out.println(ns);

    }
}
