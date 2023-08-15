import java.util.*;
public class LightOnOff {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String ;
        

    for(int i=0;i<a;i++)
    {
        arr[i]=obj.nextInt();
    }
    
    for(int i=0;i<a;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();


    for(int i=0;i<arr.length;i++)
    {
        
        if(i>=1 && i<arr.length-2)
        {
            if(arr[i-1]==arr[i+1])
            {
                 System.out.print("0");
            }
            else{
                System.out.print("1");
            }
        }
        if(i==0||i==arr.length-2)
        {
            if(arr[i+1]==1)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
        }
    }



}
}