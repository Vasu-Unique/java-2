import java.util.*;
class HashAgile
{ 
    public static void main(String args[]) 
    { 
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum1=n;
        //int a=1;
        int sum2=n+1;
        for(int i=1;i<=n;i++) 
        { 
            for(int j=1;j<n;j++) 
            { 
                if(j==1)
                {
                    System.out.print(sum1);
                    sum1=sum1-1;
                }
                if(i==1)
                {
                    System.out.print(n);
                }
                
                else{
                    System.out.print(sum2); 
                    //a++;
                } 
            } 
            sum2=sum2-1;
            System.out.println(); 
        } 
    } 
}

