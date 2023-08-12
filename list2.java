/* package whatever; // don't place package name! */  
 
import java.util.*;
import java.lang.*;
 
class Main
{
public static void main (String[] args) throws java.lang.Exception 
  { 
   // your code goes here 
  Scanner pk =new Scanner(System.in);
  String str =pk.nextLine();
  String str1[]=str.replaceAll("\\[","").replaceAll("]","").split(",");
  int arr[]=new int [str1.length];
  for(int i=0;i<str1.length;i++)
  {
    arr[i]=Integer.valueOf(str1[i].trim());
  }
  System.out.print("[");
  for(int i=0;i<arr.length;i++)
  {
    
    if(arr[i]%2==0)
    {
      System.out.print(arr[i]);
      if(i!=arr.length-1)
      {
        System.out.print(", ");
      }
    }
  }
  System.out.print("]");
   } 
 }