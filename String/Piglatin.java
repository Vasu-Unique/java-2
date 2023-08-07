package String;
import java.util.*;
public class Piglatin {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String st="";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char u=Character.toUpperCase(c);
            if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U')
            {
                if(i==0)
                st=s+"WAY";
                else
                st=s.substring(i)+s.substring(0,i)+"AY";
            }
        }
        System.out.println(st);
    }
}
;