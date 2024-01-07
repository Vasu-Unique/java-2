package String;

public class KGISLpattern {
    public static void main(String[] args)
    {
        int n=5,j,i;
        char ch='a';
        for(i=1;i<=n;i++)
        {
            char z=ch;
            for(j=i;j<=n;j++)
            {
                System.out.print(z);
                z++;
            }
            ch++;
            System.out.println();
            
        }
    }
}
