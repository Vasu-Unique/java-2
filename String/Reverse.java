package String;
import java.util.*;
public class Reverse {
    public static void main(String args[]){  
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String w="";

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            w=c+w;
        }
        System.out.println(w);
        
    }
}
