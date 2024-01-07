import java.util.*;

public class leapyear {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        if(n%400==0)
        {
            System.out.println("Leap");
        }
        else if(n%4==0 && n%100!=0)
        {
            System.out.println("Leap");
        }
        else
        {
            System.out.println("Non Leap");
        }
    }
}
