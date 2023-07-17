package Star_patterns;

public class SquareStar {
    public static void main (String args[])
    {
        int n=5,i,j;
        for(i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
