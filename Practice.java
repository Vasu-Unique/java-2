import java.util.*;
public class Practice {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String  a="vasu%k^&uni@que";
        String res="";

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(!Character.isLetterOrDigit(c))
            {
                res=res+c;
            }
        }
        System.out.println(res);

    }

    
}
