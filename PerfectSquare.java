import java.util.*;
public class PerfectSquare {
    public static void main ( String args[])
   {
      Scanner obj=new Scanner(System.in);
      int a=obj.nextInt();
      int b=obj.nextInt();

      for(int i=1;i<=b;i++)
      {
        if(i*i>=a && i*i<=b)
        {
            System.out.print(i*i+" ");
        }
      }    
   }
}
