import java.util.Scanner;

public class HashFiboPattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r1=0,r2=1,r3;
        for(int i=1;i<=n;i++)
        {
            r3=r1+r2;
            r1=r2;
            r2=r3;
            for(int j=1;j<=r3;j++)
            {
                System.out.print(r3); 
            }
            System.out.println();
        }
    }
}

