package Oop.class_attributes;

public class attrifinal {
    final  int x=10;

    public static void main (String args[])
    {
        attrifinal obj1 = new attrifinal();
        obj1.x=11; // will generate an error: cannot assign a value to a final variable
        System.out.println(obj1.x);
    }
}
