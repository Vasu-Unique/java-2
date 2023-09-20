import java.util.*;
public class PrimeEnterNum{
   public static void main ( String args[])
   {
      Scanner obj=new Scanner(System.in);
      //int a=obj.nextInt();
      int b=obj.nextInt();
    //   if(a==1)
    //   {
    //      a++;
    //   }

      for(int i=2;i<=b;i++)
      {
      boolean flag=true;
      for(int j=3;j<=Math.abs(i/2);j++)
      {
         
         if(i%j==0)
         {
            flag=false;
            break;
         }
      }
      if(flag)
      {
        while(flag)
        {
            int m=0;
            int arr[]= new int[100];
            arr[m]=obj.nextInt();
            i++;
        }
         System.out.print(i+" ");
      }
   }
    int c=obj.nextInt();
    System.out.print(arr[]);
   }
}