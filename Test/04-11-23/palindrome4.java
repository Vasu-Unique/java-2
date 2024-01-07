import java.util.*;
public class palindrome4 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String n1=obj.next();
        String n2="";
        for(int i=n1.length()-1;i>=0;i--)
        {
            n2=n2+n1.charAt(i);
        }

        System.out.println(n2);
        if(n1.equals(n2))
        {
            System.out.println("Possible");
        }
        else
        {
            System.out.println("Impossible");
        }


    }
}
