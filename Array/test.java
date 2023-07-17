package Array;
import java.util.*;

public class test {
    public int maxArea(int[] height) {
      int length=height.length;
      int end=length-1; 
      int start=0; 
      int max=0; 
      while(start<end)
      {
        int result=(end-start)* Math.min(height[start], height[end]);
        if(result>max)
        {
          max=result; 
        }
        if(height[start]< height[end])
        {
          start++; 
        }else
        {
          end--; 
        }
      }
      return max;

    }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        test ts=new test();
        int a= obj.nextInt();
        int arr[]=new int [a];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println(ts.maxArea(arr));

    }
}
