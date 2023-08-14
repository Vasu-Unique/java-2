//Delete the word RED in a sentence and print it.
package String;
import java.util.*;
public class RemoveRed {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        a=a+" ";
        String w="",ns="";

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(c!=' ')
            {
                w+=c;
            }
            else
            {
                if(!w.equals("red"))
                    ns=ns+w+" ";
                w="";
            }
        }
        System.out.println(ns);

    }
}
