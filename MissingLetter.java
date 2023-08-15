import java.util.*;
public class MissingLetter {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String b=obj.nextLine();
        int count=0;

        for(int i=0;i!='\0';i++)
        {
            char c=a.charAt(i);
            char d=a.charAt(i);
            if(c!=d)
            {
                count++;
            }
        }
        System.out.println(count);
        }
         
    }

