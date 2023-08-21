package TCS;

public class Swap2Num {
    public static void main(String args[])
    {
        int a=10;
        int b=20;

        // int t=a;
        // a=b;
        // b=t;

        // a=a+b;
        // b=a-b;
        // a=a-b;

        // a=a*b;
        // b=a/b;
        // a=a/b;

        b=a+b - (a=b);

        System.out.println(a+" "+b);
    }
}
