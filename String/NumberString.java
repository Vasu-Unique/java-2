package String;
import java.util.*;
public class NumberString {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char arr[]=a.toCharArray();
        int count=0,ans=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='0')
            {
                System.out.println("NOT valid");
            }
            else {
                for(int j=0;j<arr.length;j++)
                {
                    if((int)arr[i]%27==(int)arr[i])
                    {
                        count++;
                        if(count==a.length())
                        {
                            
                        }
                    }
                }
            }
        }
    }
}
