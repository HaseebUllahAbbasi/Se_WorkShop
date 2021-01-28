package Factory_Design.Intro;

public abstract class AbstractFactory
{
    abstract Color get_color(String color);
    abstract Shape get_shape(String shape);

}
class ShapeFactory extends AbstractFactory
{


    @Override
    Color get_color(String color) {
        return null;
    }

    @Override
    Shape get_shape(String shape) {
        if(shape==null)
            return null;
        else if(shape.equalsIgnoreCase("Circle"))
            return new Circle();
        else if(shape.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(shape.equalsIgnoreCase("Square"))
            return new Square();
        return null;

    }
}
class ColorFactory extends  AbstractFactory
{

    @Override
    Color get_color(String color) {
        if(color==null)
            return null;
        else  if(color.equalsIgnoreCase("Blue"))
            return  new Blue();
        else  if(color.equalsIgnoreCase("Green"))
            return  new Green();
        else  if(color.equalsIgnoreCase("Red"))
            return  new Red();
        return null;

    }


    @Override
    Shape get_shape(String shape) {
        return null;
    }
}