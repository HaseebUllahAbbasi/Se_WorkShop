package Builder.implementation;

public class Main
{
    public static void main(String[] args)
    {
        Director director = new Director();

        Builder_Interface car = new Car();
        Builder_Interface bike  = new Moter_Cycle();
        director.construct(car);
        Product p1 = car.getVehicle();
        p1.show();


    }
}
