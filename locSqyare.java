/* package whatever; // don't place package name! */  
 
import java.util.*;
import java.lang.*;
 
class Main
{
public static void main (String[] args) throws java.lang.Exception 
  { 
   // your code goes here 
  Scanner pk =new Scanner (System.in);
  int n =pk.nextInt();
   n = n*3;
  int arr[]=new int[n];
  for(int i=0;i<n;i=i+3)
  {
    arr[i]=pk.nextInt();
    arr[i+1]=arr[i]*arr[i];
    arr[i+2]=arr[i+1]*arr[i];
   } 
  for(int i=0;i<n;i=i+3)
  {
    System.out.print(arr[i]+"-"+arr[i+1]+"-"+arr[i+2]);
    if(i<arr.length -3)
    {
      System.out.print("@");
    }
  }
  System.out.print("@");
}
 }