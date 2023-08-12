<<<<<<< HEAD
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
=======
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
>>>>>>> d15afd13885a3ce66a79af76537c18e6a1238446
