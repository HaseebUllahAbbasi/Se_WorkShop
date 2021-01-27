package Principle_of_design_patterns.Liskov;

public class Main
{
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.get_speed();
        vehicle = new Car();
        vehicle.get_capacity();
    }

}
