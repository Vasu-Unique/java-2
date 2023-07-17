public class rathinam {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=29;i++)
        {
            for(int j=1;j<=41;j++)
            {
                if(i==1||i==5||i+j==6)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
        System.out.println();
        }
    }
}
