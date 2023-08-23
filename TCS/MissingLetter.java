package TCS;
import java.util.*;
public class MissingLetter {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String b=obj.nextLine();
        int count=0;
        int i;
        for( i=0;i<a.length();i++)
        {
            if (a.charAt(i) != b.charAt(i)) {
                System.out.print(b.charAt(i));
            if(a.charAt(i)==b.charAt(" "));
            {
                System.out.print(a.charAt(i));
            }
        }
        
        }
        
         
    }
}
