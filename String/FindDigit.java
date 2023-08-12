package String;

import java.util.Scanner;

public class FindDigit {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c)) //Character.isLowerCase(c),Character.isDigit(c)
            {
                System.out.println(c);
            }
        }
    }
}
