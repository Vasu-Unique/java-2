package Level0;

import java.util.Scanner;

public class print27 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int count=0;

        while(a>0)
        {
            a=a-b;
            count++;
        }
        if(a==0)
            System.out.println(count);
        else
            System.out.println(count-1);


}
}