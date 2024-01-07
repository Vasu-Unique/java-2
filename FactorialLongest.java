import java.math.BigInteger;
import java.util.*;
public class FactorialLongest {
		public static void main(String[] args) 
		{
			Scanner obj=new Scanner(System.in);
		    int a=obj.nextInt();
			BigInteger fact=BigInteger.ONE;

			for(int i=1;i<=a;i++)
			{
				fact=fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
		}

	}