package Test;
import java.util.*;
public class test5 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[500];
        int ans=0;

        for(int i=0;i<n;i++){
        int color=obj.nextInt();
        arr[color]++;
        if(arr[color]%2 == 0){
        ans++;
        arr[color] = 0;
        }
        }
        System.out.println(ans);
        }
    }
