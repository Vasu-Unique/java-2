import java.util.*;
public class print16 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner (System.in);
        int n=obj.nextInt();

        if((n%4==0 & n%100!=0)||n%400==0)
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not leap year");
        }

    }
}
