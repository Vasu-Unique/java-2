import java.util.*;
public class StringReverse {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String n=obj.next();
        for(int i=n.length()-1;i>=0;i--)
        {
            System.out.print(n.charAt(i));
        }

    }
}
