/* package whatever; // don't place package name! */  
 
import java.util.*;
import java.lang.*;
 
class Main
{
public static void main (String[] args) throws java.lang.Exception 
  { 
   Scanner obj=new Scanner(System.in);
  	int a= obj.nextInt();
  	int arr[]=new int[a];
  	int count=0;
  
  for(int i=0;i<a;i++)
  {
    arr[i]=obj.nextInt();
  }
  
  for(int i=0;i<a;i++)
  {
	for(int j=i+1;j<a;j++)
    {
      if(arr[i]==arr[j])
      {
        count++;
		System.out.println(arr[i]);
        }
      }
   }
  if(count==0)
  {
    System.out.println("The list is empty");
  }
  }
}
