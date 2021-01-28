package Abstract_Factory.Implementation;

public class Main
{
    public static void main(String[] args)
    {
        AbstractFactory shape_fact = FactoryProducer.getFactory("Shape");
        Shape shape_1 = shape_fact.get_shape("Circle");
        shape_1.draw();

        AbstractFactory color_fact = FactoryProducer.getFactory("Color");
        Color color_1 =  color_fact.get_color("Blue");
        color_1.fill();

    }

}
