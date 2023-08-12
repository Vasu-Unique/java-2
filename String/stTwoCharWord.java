//To Find two letter Word in String
package String;
import java.util.*;
public class stTwoCharWord {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
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
                System.out.println(w.substring(0,2));
                //System.out.println(w.charAt(0));
                w="";
            }
        }
    }
}
