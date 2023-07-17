package Night;

public class NumPattern {
    public static void main(String args[])
    {
        int n=7,i,j;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print("1");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
        System.out.println();
        }
    }
}