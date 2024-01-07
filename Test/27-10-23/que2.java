import java.util.*;

class que2 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int [a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
         for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }  
            }

        }
    }
}
