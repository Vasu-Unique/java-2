import java.util.*;
class ContiguousSum{
    static void arr(int a[],int b[],int len,int index)
    {
        if(index==len)
        {
            for(int i=0;i<len;i++)
            {
                System.out.println(a[i]);
            }
        }
        else
        {
            b[index]=1;
            arr(b,a,len)
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        int b[]=new int[5];
        arr(a,b,a.length,0);
    }
}