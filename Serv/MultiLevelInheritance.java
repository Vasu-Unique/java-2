class Animal
{
    void eat()
    {
        System.out.println("Eating..");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Barking..");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("Meowing");
    }
}
public class MultiLevelInheritance {
    public static void main(String args[])
    {
        cat c =new cat();
        c.meow();
        c.eat();
        //c.bark();
    }
}
