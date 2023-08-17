import java.util.Scanner;

public class DeciToBinary {
      public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0,r,q,sum1=0;
        
        while(n>0)
        {
            r=n%2;
            q=n/2;
            n=q;
            sum=(sum*10)+r; 
        }
        System.out.println(sum);

        // while(sum>0)
        // {
        //     r=sum1%10;
        //     sum1=(sum1*10)+r;
        //     sum1=sum1/10; 
        // }
        // System.out.println(sum1);

    }
}
