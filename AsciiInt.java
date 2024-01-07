import java.util.Scanner;

public class AsciiInt {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int c = obj.nextInt()+64;
        char asc = (char) c;
        
        if(26<=c)
        {
            System.out.print(asc);
        }
        else
        {

            for(int i=2;i<9;i++)
            {
                int last=c%10;
                
            }
        }
        
    }
}
