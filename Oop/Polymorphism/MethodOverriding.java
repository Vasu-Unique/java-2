package Oop.Polymorphism;

import java.util.*;
//we use different class in overriding
class parent  {
    void ride()
    {
        System.out.println("Parent Class");
    }
}

class OverRiding extends parent
{
    void ride()
    {
        System.out.println("Child Class");
        super.ride();
    }

    public static void main(String args[])
    {
        parent obj=new OverRiding();
        obj.ride();
    }
}

// class parent  {
//     // we cannot overriide static method and also we private means give error
//     static void ride()   
//     {
//         System.out.println("Parent Class");
//     }
// }

// class OverRiding extends parent
// {
//     static void ride()
//     {
//         System.out.println("Child Class");
//         //super.ride();
//     }

//     public static void main(String args[])
//     {
//         parent obj=new OverRiding();
//         obj.ride();
//     }
// }