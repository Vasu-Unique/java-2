package Level0;
import  java.util.*;
public class print20 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();

        if(a<=31 && b<=12 && (c<=9999||1900<=c))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Not Valid");
        }

    }

}
