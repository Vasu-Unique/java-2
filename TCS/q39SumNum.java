package TCS;

import java.util.*;

public class q39SumNum {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(); 
        int r,sum=1;     
           
        while(n>0){    
         r=n%10;   
         sum=sum*r;    
         n=n/10;    
        }    
        System.out.println(sum); 
      } 
}

