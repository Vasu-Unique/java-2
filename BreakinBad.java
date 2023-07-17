import java.util.*;
public class BreakinBad {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a="Breaking Bad";
        String[] b=a.split(" ");
        String c=b[0];
        String d=b[1];
        int max= Math.max(c.length(),d.length());

        for(int i=0;i<max;i++)
        {
            for(int j=0;j<=i && j!=c.length();j++)
            {
                System.out.print(c.charAt(j));
            }
            for(int k=0;k<=i && k!=d.length();k++)
            {
                System.out.print(d.charAt(k));
            }
        System.out.println();
        }
        
    }
    
}
