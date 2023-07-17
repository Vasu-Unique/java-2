import java.util.*;
//we use different class in overriding
class parent  {
    void ride()
    {
        System.out.println("Parent Class");
        System.out.println("Vasanth mop mandaiyah>>>>>>......");
    }
}

class OverRiding extends parent
{
    void ride()
    {
        System.out.println("Child Class");
        System.out.println("Hari brush mandaiyah>>>>>>....");
        System.out.print("\n");
        super.ride();
    }

    public static void main(String args[])
    {
        OverRiding obj=new OverRiding();
        obj.ride();
    }
}
