import java.util.Scanner;

public class Occurence {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int b=obj.nextInt();
        char[] a=obj.nextLine().toCharArray();
        int count=0;
        
        

        for(int i=0;i<a.length;i++)
        {
            if(a.charAt(i).equals(b))
            {
                count++;
            }
   
        }
        System.out.println(count);
}
}
