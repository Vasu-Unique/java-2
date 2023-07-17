import java.util.*;
class vowel
{
   public static void main(String args[])
   {
      Scanner obj = new Scanner(System.in);
      String a=obj.nextLine().toLowerCase();
      char[] arr=a.toCharArray();
      //System.out.println(arr.length);
      int count=0;
      int b=0;
      for(int i=0;i<arr.length;i++)
      {
         if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
         {
            
            if(arr[i]=='a')
            {
               b++;
            }

            count++;
         }

      }
      if(count!=0)
      {
      System.out.println("YES");
      }
      System.out.println("a value is:"+b);
      System.out.println("vowel: " +count);
   }
}