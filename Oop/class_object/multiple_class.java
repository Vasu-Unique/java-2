package Oop.class_object;

public class multiple_class {
    int x=5;
}

class second{
    public static void main(String args[]){
    multiple_class obj1=new multiple_class();
    System.out.println(obj1.x);
    }
}
