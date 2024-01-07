package NumberPattern;

public class num123 {
    public static void main(String args[])
    {
        int n=4,p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(p+" ");
                p++;
            }
        System.out.println();
        
        }
    }
}
