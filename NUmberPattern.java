import java.util.*;
class NUmberPattern
{ 
    public static void main(String args[]) 
    { 
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=n;i>=1;i--) 
        { 
            for(int j=n;j>=1;j--) 
            { 
                if(i>=j) 
                { 
                    System.out.print(i); 
                } 
                else 
                { 
                    System.out.print(j); 
                } 
            } 
            System.out.println(); 
        } 
    } 
}