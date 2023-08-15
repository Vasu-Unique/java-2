import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0,r;
        
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10; 
        }
        System.out.println(sum);
    }
}