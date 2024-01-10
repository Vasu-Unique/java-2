package Oop.Polymorphism;
import java.util.*;

public class MethodOverloading {

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

    public static void main(String args[])
    {
        MethodOverloading obj=new MethodOverloading();
        obj.add(1,2);
        obj.add(1,2,3);
    }
}


// class MethodOverloading {

//     // this method accepts int
//     private static void display(int a){
//         System.out.println("Got Integer data.");
//     }

//     // this method  accepts String object
//     private static void display(String a){
//         System.out.println("Got String object.");
//     }

//     public static void main(String[] args) {
//         display(1);
//         display("Hello");
//     }
// }