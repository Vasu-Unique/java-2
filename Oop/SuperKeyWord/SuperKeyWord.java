package Oop.SuperKeyWord;
import java.util.*;

class Vehicle 
{ 
int maxSpeed = 120;  
} 

class Car extends Vehicle
{ 
int maxSpeed = 180;
} 

void display()
{
System.out.println("Maximum Speed: "+ super.maxSpeed); 
System.out.println("Maximum Speed: "+ maxSpeed);
} 

class SuperKeyWord 
{ 
    public static void main(String[] args) 
    { 
    Car small = new Car(); 
    small.display(); 
    } 
}

