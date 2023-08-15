//Find if the word OR exists in a String.
import java.util.*;
public class CountWord {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        String a=obj.nextLine();
        String b=obj.nextLine();
        String w="";
        a=a+" ";
        int count=0;

        for(int i=0;i<a.length();i++)
        {
            //char c=a.charAt(i);

                if(w.equalsIgnoreCase(b))
                {
                    count++;
                }
                //w="";
            }
             System.out.println(count);
        }
       
        
}

