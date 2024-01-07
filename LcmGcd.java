//Using Recursion

// import java.util.*; 
// public class LcmGcd 
// { 
	
// 	static int gcd(int a, int b) 
// 	{ 
// 		if (a == 0) 
// 			return b; 
// 		return gcd(b % a, a); 
// 	} 
	
// 	static int lcm(int a, int b) 
// 	{ 
// 		return (a / gcd(a, b)) * b; 
// 	} 
// 	public static void main(String[] args) 
// 	{ 
//         Scanner obj=new Scanner(System.in);
// 		int a =obj.nextInt();
//         int b=obj.nextInt();
// 		System.out.println(lcm(a, b)+" "+gcd(a,b)); 
// 	} 
// } 

//Normal Method

import java.util.*;
public class LcmGcd{
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int gcd=0;
        
        for(int i=1;i<=n1&&i<=n2;i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                gcd=i;
            }
        }
        
        System.out.print(n1*n2/gcd+" "); //lcm
        System.out.print(gcd); //gcd
    }
}