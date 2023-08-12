//Find if the word OR exists in a String.
package String;
import java.util.*;
public class WordExist {
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
        if(count==0)
            System.out.println("Not Found");
        else
            System.out.println("Found");
        
}
}