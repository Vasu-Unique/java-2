package Star_patterns;
import java.util.Scanner;

public class s1 {
    public static void main(String args[])
    {
       Scanner obj = new Scanner(System.in);
       int n = obj.nextInt();
       int row,col;
       for(row=1;row<=n;row++)
       {
        
        for(col=1;col<=row;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}
