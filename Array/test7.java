package Array;

import java.util.*;
import java.lang.*;
import java.io.*;/* Name of the class has to be "Main" only if the class is public. */
class test7
{
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  int n=0,k=0;
  
  while(t-- >0){
      n = sc.nextInt();
      k = sc.nextInt();
      int total=0,moves=1;
      int arr[] = new int [n];
      for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
      
      for(int i=0;i<n;i++){
          if(arr[i]>k){
              moves=-1;
              break;
          }
          else if(total+arr[i]<=k){
              total= total+arr[i];
          }
          else{
              moves++;
              total = arr[i];
          }
      }
      System.out.println(moves);
      
  }
 }
}