package TCS;
import java.util.*;
public class RotationString {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a="ABCD";
        String b="CDAB";
        String res="",a1;
        a1=a+a;
        int count=0;
        char arr[]=a1.toCharArray();

        for(int i=0;i<=a1.length()-b.length();i++)
        {
            for(int j=i;j<i+b.length();j++)
            {
                res=res+arr[j];  //compound Assignment res+=arr[j];
            }
            if(res.equals(b))
            {
                count++;
            }
            res="";
        }
        if(0<count)
            System.out.println("YES");
        else
             System.out.println("NO");
    }
}
