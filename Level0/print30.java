package Level0;
import java.util.Scanner;

import Alphabet_pattern.Alphabet.a;
public class print30 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();

        while(a-->0)
        {
            for(char i='a';i<='z';i++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
