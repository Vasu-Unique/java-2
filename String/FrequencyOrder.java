package String;
import java.util.*;
public class FrequencyOrder {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char[] arr1=s.toCharArray();


        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for (int j=0;j<s.length();j++)
            {
                if(j<i&&arr1[i]==arr1[j]) //remove duplicate
                {
                    break;
                }
                if(arr1[i]==arr1[j])
                {
                    count++;
                }  
                // if(j==s.length()-1) //it prints j ends value
                // {
                //     System.out.println(arr1[i]+"-->"+count);
                // }
            }
            
        }
    }
}