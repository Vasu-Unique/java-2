//Array list using literals
//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList2 {
    public static void main (String args[])
    {
        Scanner obj1= new Scanner(System.in);
        ArrayList <Integer> sum=new ArrayList <Integer>();
        System.out.println("Enter SIZE");

        int n=obj1.nextInt();
        for(int i=0;i<n;i++)
        {
            sum.add(obj1.nextInt());
        }
        System.out.println(sum);
    }
    
}
