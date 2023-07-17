import java.util.*;
public class code2 {
    public static void print(int a[]){
        for(int j=0;j<a.length;j++)
        {
        System.out.print(a[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Array 1");
        int a=obj.nextInt();
        int arr1[]=new int [a];
       int x=0,y=0;
        for(int i=0;i<a;i++)
        {
            arr1[i]=obj.nextInt(); 
        }
        System.out.println("Enter Array 2");
        int b=obj.nextInt();
        int arr2[]=new int [b];
        for(int j=0;j<b;j++)
        {
            arr2[j]=obj.nextInt(); 
        }
        
        int c=a+b;
        int arr3[]=new int[c];
   
        for(int i=0;i<c;i++)
        {
            if(i<arr1.length)   //index bound error means for loop length or range problem, remove lessthan or equalto
            {
            arr3[i]=arr1[x];
            x=x+1;
            }else{
                arr3[i]=arr2[y];
                y=y+1;
            }
        }
print(arr3);
//print(arr2);

}
}
