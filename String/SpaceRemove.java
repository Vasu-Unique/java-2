package String;
import java.util.*;
public class SpaceRemove {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String w="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                w=w+c;
            }
            else{
                w="";
                //System.out.print(w);
            }
        }
        System.out.println(w);
        

    }
}
