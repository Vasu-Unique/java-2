import java.util.*;

class StringReverse
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String b="";

        for(int i=0;i<a.length();i++)
        {
            char c =a.charAt(i);
            b=c+b;
        }
        System.out.println(b);
    }
}