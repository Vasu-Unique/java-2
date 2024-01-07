import java.util.*;
class ArrayCoin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int arr[]=new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res[]=new int[sum+1];
        res[0]=1;

        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            for(int j=temp;j<=sum;j++){
                res[j]+=res[j-temp];
            }
        }System.out.print(res[sum]);
    }
}
/*
4
1 2 3
4
*/