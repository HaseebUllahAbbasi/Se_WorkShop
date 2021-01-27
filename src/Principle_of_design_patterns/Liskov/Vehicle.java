package Principle_of_design_patterns.Liskov;

public abstract class Vehicle
{
    abstract int get_speed();
    abstract int get_capacity();

}
class Car extends  Vehicle
{
    int get_speed(){
        return 0;
    }
    int get_capacity(){
        return 0;
    }

}
class Bus extends  Vehicle
{
    int get_speed(){
        return 0;
    }
    int get_capacity(){
        return 0;
    }

}
