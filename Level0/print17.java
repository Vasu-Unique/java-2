package Level0;

import java.util.Scanner;

public class print17 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if(a<=24&&b<=60&&c<=60)
        {
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }

    }
}
