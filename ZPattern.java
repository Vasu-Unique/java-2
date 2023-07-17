public class ZPattern {
    public  static void main(String args[])
    {
        int n=6,i,j;
        System.out.println("@@@@@@@@@");

        for(i=1;i<=n;i++,System.out.println())
            {
                for(j=1;j<=n;j++)
                {
                if (i+j==n+1)
                    System.out.print("## ");
                else
                    System.out.print("  ");
                }
     
            }
        System.out.print("@@@@@@@@@");
    }
       
}