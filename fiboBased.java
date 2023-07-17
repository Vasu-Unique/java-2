/*
 An e-commerce website wishes to find the lucky customer who will
be eligible for full value cash back. For this purpose, a number N is fed
to the system. It will return another number that is calculated by an
algorithm. In the algorithm, a sequence is generated, in which each
number is the sum of the two preceding numbers. Initially the
sequence will have two 1’s in it. The system will return the Nth number
from the generated sequence which is treated as the order ID. The
lucky customer will be the one who has placed that order.
Write an algorithm to help the website find the lucky customer.

Input
The input consists of an integer token, representing the number fed to
the system (N).
Output
Print an integer representing the order ID of the lucky customer.
Example
Input:
8
Output:
21

 */
import java.util.*;
public class fiboBased {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int count=obj.nextInt();
        int n1=0,n2=1,n3=0,i;      
           
        for(i=2;i<=count;++i)   
        {    
         n3=n1+n2; 
         n1=n2;    
         n2=n3;    
        }
        System.out.print(n3);

            



}   
}
