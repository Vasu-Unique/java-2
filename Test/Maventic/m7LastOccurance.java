package Test.Maventic;
import java.util.*;
public class m7LastOccurance {
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        String a=obj.next();
        char arr[]=a.toCharArray();
        String b=obj.next();
        int index=0;
        
        
        
        for(int i=0;i<a.length();i++)
        {
            if(arr[i]==b && index==0)
            {
                index+=i;
            }
        }
        
        System.out.println(index);
    }
}
