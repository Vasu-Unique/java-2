package Night;
import java.util.*;
public class MetaString {
        public static void main(String[] args) 
        {
        
            Scanner sc=new Scanner(System.in);
            int t=4;
            while(t-->0){
                String s1=sc.next();
                String s2=sc.next();
                int c=0;
                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i)!=s2.charAt(i))
                       c++;
                }
                if(c>2)
                  System.out.println("No");
                else
                   System.out.println("Yes");
                }
        }
    }
