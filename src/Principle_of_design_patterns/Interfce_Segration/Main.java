package Principle_of_design_patterns.Interfce_Segration;

public class Main
{

}
interface  Shape_Interface
{
    double area();
}
interface Solid_shape
{
    double volume();
}
interface  ManagementInterface
{
    double calculate();
}
class Cube implements  ManagementInterface , Solid_shape, Shape_Interface
{

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double calculate() {
        return  volume()+ area();
    }
}
class Square implements  Shape_Interface , ManagementInterface
{


    @Override
    public double calculate() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}