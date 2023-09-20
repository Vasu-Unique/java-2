import java.util.*;
public class Practice {
    public static void main(String args[])
    {
        String a="jimdfjimsdfjimadjim";
        String b="jim";
        char arr[]=a.toCharArray();
        String res="";
        int count=0;

        for(int i=0;i<a.length()-b.length();i++)
        {
            for(int j=i;j<i+b.length();j++)
            {
                res=res+arr[j];
            }
            if(res.equals(b))
            {
                count++;
            }
            res="";
        }
        System.out.println(count);

    }

    
}
