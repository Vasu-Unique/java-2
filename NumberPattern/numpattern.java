package NumberPattern;

public class numpattern {
    public static void main(String args[])
    {
        int n=5,r,c;
        for(r=1;r<=n;r++,System.out.println(" \n "))
        {
            if(r%2==0)
                System.out.print(r+1);
            for(c=1;c<=n;c++)
                System.out.print(r);
            if(r!=0)
                System.out.print(r+1);
        }
    }

}
