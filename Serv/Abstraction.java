//package Serv;

class A
{
    void run()
    {
        System.out.println("Hello");
    }
}

class B
{
    void set()
    {
        System.out.println("World");
    }
}
class Abstraction {
    public static void main(String args[])
    {
        A obj=new A();
        B obj1=new B();
        obj.run();
    }
}
