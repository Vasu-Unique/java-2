package Alphabet_pattern.Alphabet;

public class o {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1&j>=2&j<=4||i==5&j>=2&j<=4||j==1&i>=2&i<=4||j==5&i>=2&i<=4)
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
