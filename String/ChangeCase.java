package String;
import java.util.*;
public class ChangeCase {
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
                if(w.length()%2==0)
                    ns=ns+w.toUpperCase()+" ";
                else
                    ns=ns+w.toLowerCase()+" ";
                w="";
            }
        }
        System.out.println(ns);
    }
}
