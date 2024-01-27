package Oop;

class Employee{
    int a; //Default constructor
    String b; 
    Employee(int a,String b)  //Paramterized constructor
    {
        System.out.println(a);
        System.out.println(b);
    }
    Employee() //No Argument constructor
    {
        System.out.println("I'm a No argument Constructor");
    }


}
public class Constructor {
    public static void main(String args[])
    {
        //Employee obj=new Employee(23,"prabanjan");
        Employee obj=new Employee();
        System.out.println(obj.a);
        System.out.println(obj.b);


    }
}
