import java.util.*;

public class FactorialLongest {
     public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a= obj.nextInt();
    String count="";
    
    for(int i=1;i<=a;i++)
    {
        count=count+i;
    }
    System.out.println(count);
    }
}
