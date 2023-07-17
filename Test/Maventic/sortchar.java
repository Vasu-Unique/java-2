package Test.Maventic;
import java.util.*;
public class sortchar {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        String a =obj.nextLine();
        char arr[]=a.toCharArray();
        

        for(int i=0;i<=a.length();i++)
        {
            for(int j=i+1;j<=a.length();j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    int count=0;
                    count++;
                    i=count;
                }
            }
            System.out.println(a.charAt(i)+count);
        }
        
    }
    
}
