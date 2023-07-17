package Alphabet_pattern.Alphabet;

public class v {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=9;j++)
            {
                if(i==j||i+j==10)
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
