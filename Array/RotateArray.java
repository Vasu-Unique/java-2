import java.util.*;
class RotateArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[7];
        
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        int k=obj.nextInt();

        int temp=0;
        int target[]=new int[arr.length];
        int j=0;
        for(int i=k+1;i<arr.length;i++)
        {
            target[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i<k)
            System.out.print(target[i]+" ");
            else
                System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}