//print 3 words in string
package String;
import java.util.*;
public class Words3print {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        String a=obj.nextLine();
        String w="";
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
                if(w.length()==3)
                {
                    System.out.println(w);
                }
                w="";
            }
        }
    }
}
