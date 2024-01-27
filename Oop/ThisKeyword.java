package Oop;

class vasu{
    int num1;  //instace variable
    int num2;
    void getdata(int num1,int num2)  //this keyword enna sollutha num1,num2 intha class oda instace variable than
    {
        this.num1=num1;  //local variable
        this.num2=num2;
    }

    void display()
    {
        System.out.println(num1);
        System.out.println(num2);
    }


}
public class ThisKeyword {
    public static void main(String[] args) {
        vasu obj=new vasu();
        obj.getdata(1, 2);
        obj.display();

    }
}
