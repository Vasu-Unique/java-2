import java.util.*;
public class FindNumber1 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner( System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        
        int flag=0;

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        int b=obj.nextInt();

        for(int i=0;i<a;i++)
        {
            if(arr[i]==b)
            {
                //System.out.println("YES");
                flag++;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
