package Alphabet_pattern.Alphabet;

public class s {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==3||i==5||i==4&j==5||i==2&j==1)
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
