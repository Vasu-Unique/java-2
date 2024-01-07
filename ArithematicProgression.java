import java.util.*;
class ArithematicProgression{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=obj.nextInt();
        int d=obj.nextInt();
        int res=0;
        
            res=a+(n-1)*d;
        
        System.out.print(res);
    }
}