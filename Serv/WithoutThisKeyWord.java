//without using Thiskeyword

class ThisDemo
{
    int n1,n2;
    ThisDemo(int a,int b)
    {
        n1=a;
        n2=b;
    }

    void display()
    {
        System.out.println(n1);
        System.out.println(n2);
    }
}


public class WithoutThisKeyWord {
    public static void main(String args[])
    {
        ThisDemo obj = new ThisDemo();
        obj.display();
    }
}
