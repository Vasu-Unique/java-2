import java.io.*;
import java.lang.*;
import java.util.*;

interface one
{
    public void print_geek();
}
interface two
{
    public void print_for();
}
interface three extends one,two
{
    public void print_geek();
}

class child implements three
{
    public void print_geek()
    {
        System.out.println("vasu");
    }
    public void print_for()
    {
        System.out.println("unique");
    }
}

public class vasu {
    public static void  main(String args[])
    {
        child c=new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
