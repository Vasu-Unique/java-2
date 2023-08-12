package String;

import java.util.Scanner;

public class CountTotalWords {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        String a=obj.nextLine();
        String w="";
        a=a+" ";
        int count=0;

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(c!=' ')
            {
                w+=c;
            }
            else
            {
                if(w.equalsIgnoreCase("OR"))
                {
                    count++;
                }
                w="";
            }
        }
}
