/*  
OUTPUT:
    1
    b2
    3c3
    d4d4
    5e5e5
    f6f6f6
*/

package NumberPattern;
    import java.util.*;
    // class HashPattern
    // {
    // public static void main(String[] args)
    // {
    //     int n=6;
    //     char ch='a';

    //     for(int i=1;i<=n;i++)
    //     {
    //         if(i%2==0)
    //         {
    //             for(int j=1;j<=i;j++)
    //             {
    //                 if(j%2!=0)
    //                 {
    //                 System.out.print(ch);
    //                 }
    //                 else
    //                 {
    //                 System.out.print(i);
    //                 }
    //             }
    //             ch++;              
    //         }
    //         if(i%2!=0)
    //         {
    //             for(int j=1;j<=i;j++)
    //             {
    //                 if(j%2==0)
    //                 {
    //                 System.out.print(ch);
    //                 }
    //                 else
    //                 {
    //                 System.out.print(i);
    //                 }
    //             }
    //             ch++;
               
    //         }
    //         System.out.println();
    //     }
    // }
    // }
    
    class HashPattern
    {
    public static void main(String[] args)
    {
        int n=6;
        char ch='a';

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                for(int j=1;j<=i;j++)
                {
                    if(j%2!=0)
                    {
                    System.out.print(ch);
                    }
                    else
                    {
                    System.out.print(i);
                    }
                }
                ch++;              
            }
            if(i%2!=0)
            {
                for(int j=1;j<=i;j++)
                {
                    if(j%2==0)
                    {
                    System.out.print(ch);
                    }
                    else
                    {
                    System.out.print(i);
                    }
                }
                ch++;
               
            }
            System.out.println();
        }
    }
    }
    
