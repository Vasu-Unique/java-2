package Oop.SuperKeyWord;
import java.util.*;

class Vehicle 
{ 
int maxSpeed = 120;  
} 

class Car extends Vehicle
{ 
    int car = 180;
    void display()
        {
        System.out.println("Maximum Speed: "+ super.maxSpeed); //super Keyword
        System.out.println("Maximum Speed: "+ maxSpeed);
        } 
} 
// class bike extends Car
// { 
//     int maxSpeed = 200;
//     void display()
//         {
//         System.out.println("Vechile Speed: "+ super.maxSpeed); //super Keyword
//         System.out.println("Car Speed: "+ car);
//         System.out.println("Bike Speed: "+ maxSpeed);
//         } 
// } 



class SuperKeyWord 
{ 
    public static void main(String[] args) 
    { 
    Car small= new Car();
    //bike small = new bike(); 
    small.display(); 
    } 
}

