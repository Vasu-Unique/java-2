import java.util.*;
class hari
{
    public void lorry()
    {
        System.out.println("Ayyappan");
    }
}

class jaya extends hari
{
    public void contructor()
    {
        System.out.println("Baskar");
    }
}

class raj extends jaya
{
    void auto()
    {
        System.out.println("Pandiyaraj");
    }
}

public class Inheritance2 {
    public static void main(String args[])
    {
        raj obj= new raj();
        obj.contructor();
        obj.lorry();
        obj.auto();
    }
    
}
