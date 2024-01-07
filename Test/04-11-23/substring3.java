import java.util.*;
public class substring3 {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        String a=obj.nextLine();
        char arr1[]=a.toCharArray();
        String b=obj.nextLine();
        char arr2[]=b.toCharArray();
        String d=obj.nextLine();
        String res="",ns="";
        a=a+" ";
        int count=0;

        for(int i=0;i<(arr1.length - arr2.length)+1;i++)
        {
            res=a.substring(i, i+arr2.length);
            if (res.equals(b))
                ns=ns+d;
            else
                ns=arr1[i];
                
            
        }

        System.out.print(ns);
        }
        

    }

