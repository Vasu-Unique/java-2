package Serv;
import java.util.*;
public class Anagram {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String a=obj.nextLine();
        String b=obj.nextLine();

        a=a.toLowerCase();
        b=b.toLowerCase();

        if(a.length()==b.length())
        {
            char[] a1=a.toCharArray();
            char[] b1=b.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            if(Arrays.equals(a1,b1))
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not Anagram");
            }
        }
    }
}
