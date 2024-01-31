import java.util.*;
public class PrimeNumberRange
{
   public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      if(n==1)
      {
         n++;
      }
         for(int i=2;i<=n;i++)
         {
            int flag=1;
            for(int j=2;j<=Math.sqrt(i/2);j++)
            {
               if(i%j==0)
               {
                  flag=0;
                  break;
               }
            }
            if(flag==1)
            {
               System.out.print(i+" ");
            }
         }
      
   }
}

// public class PrimeNumberRange{
//    public static void main ( String args[])
//    {
//       Scanner obj=new Scanner(System.in);
//       int a=obj.nextInt();
//       int b=obj.nextInt();
//       if(a==1)
//       {
//          a++;
//       }

//       for(int i=a;i<=b;i++)
//       {
//       boolean flag=true;
//       for(int j=2;j<=Math.abs(i/2);j++)
//       {
         
//          if(i%j==0)
//          {
//             flag=false;
//             break;
//          }
//       }
//       if(flag)
//       {

//          System.out.print(i+" ");
//       }
//    }
//    }
// }
