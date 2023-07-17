package Alphabet_pattern.Alphabet;

import java.util.Scanner;

public class y {
    public void ys()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j&i<=3||i+j==6&i<=3||i>3&j==3)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
        System.out.println();
        }
    }
    public void xs()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j||i+j==6)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
        System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        y js=new y();
        char ch;

        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            switch(ch)
            {
                case 'y': js.ys();
                break;
                case 'x': js.xs();
                break;
                default:
                System.out.print("error");

            }
        }
     
    
       
    }
}
