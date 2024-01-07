package String;

import java.util.Scanner;

public class StringArray {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        String arr[]=new String[a];
        // char[] arr1 = obj.nextLine().toCharArray();
        String z=obj.nextLine();

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextLine();
        }

        for(int j=0;j<a;j++)
        {
            for(int k=0;k<arr[j].length();k++)
            {
                char b=arr[j].charAt(k);
                System.out.print(b+" ");
            }
        }
            
        
    }
}