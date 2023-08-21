package TCS;

import java.util.Scanner;

public class q38CountSplChar {
     public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    String a=obj.nextLine();
    int count=0;

    for(int i=0;i<a.length();i++)
    {
        char c=a.charAt(i);
        if(Character.isDigit(c)||Character.isLetter(c))
        {
            count++;
        }
    }
    System.out.println(a.length()-count);
}
}