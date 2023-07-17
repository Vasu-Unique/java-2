import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
		double sum=a;

        for(int i=0;i<n;i++){
            double j=Math.pow(2,i)*b;
			sum=sum+j;
			System.out.printf(sum+" ");
        }
        in.close();
    }
}
