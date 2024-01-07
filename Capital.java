import java.util.Scanner;

public class Capital {
     public static void main(String[] args)
        {
         Scanner obj=new Scanner(System.in);
         String a=obj.nextLine();
         char arr[]=a.toCharArray();
         int count=0;

         for(int i=0;i<a.length();i++)
         {
            if(i==0 || i==a.length()-1)
            {
                arr[i]=Character.toUpperCase(arr[i]);
                count++;
            }
            else if(arr[i]==' ')
            {
                arr[i-1]=Character.toUpperCase(arr[i-1]);
                count++;
                arr[i+1]=Character.toUpperCase(arr[i+1]);
                count++;
            }
            
         }
         //arr[a.length()]=Character.toUpperCase(arr[a.length()]);
         System.out.println(arr);
         System.out.println(count);

}
}