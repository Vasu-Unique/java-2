import java.util.*;
// In overLoding we use diff parameters
public class OverLoading {
    void poly(int i)
    {
        System.out.println("Hello");
    }
    void poly(double f)
    {
        System.out.println("Welcome");
    }
    void poly(String j)
    {
        System.out.println("Pavi Mouse");
    }

    public static void main(String args[])
    {
        OverLoading obj= new OverLoading();
        obj.poly(4.4);   
        obj.poly(4);
        obj.poly("4.4");
    }
}
