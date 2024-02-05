import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
      int a=obj.nextInt();
        int sum=0;
      for(int i=1;i<=a/2;i++)
      {
        if(a%i==0)
        {
            sum=sum+i;
        }
      }
      if(sum==a)
      {
        System.out.print("perfect Number");
      }
    }
}
