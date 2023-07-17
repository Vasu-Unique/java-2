import java.util.*;
public class BreakingBadCapital {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a="Breaking Bad";
        // String[] b=a.split(" ");
        // String c=b[0];
        // String d=b[1];
        // int max= Math.max(c.length(),d.length());

        // for(int i=65;i<=90;i++)
        // {
        //     System.out.println((char) i);
            
        // }
            char ch;
            char[] arr;
            arr = new char[];
        char[] brr;
        ArrayList.de
        int i=0,j=0;
        int flag=0;
        for(int k=0;k<a.length();k++)
        {
            ch=a.charAt(k);
            if((int)ch>64&&(int)ch<91)
            {
                flag++;
            }
            if(flag==1)
            {
                arr[i]=a.charAt(k);
                i++;
            }
        }
    }
}
