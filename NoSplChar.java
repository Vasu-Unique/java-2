import java.util.*;
public class NoSplChar {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String w="";

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            
            if(Character.isDigit(c)||Character.isLowerCase(c)||Character.isUpperCase(c))
            {
              System.out.print(c);  
            }
        }
       
    }
}
