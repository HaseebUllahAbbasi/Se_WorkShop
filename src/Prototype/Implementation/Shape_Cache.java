package Prototype.Implementation;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;

public class Shape_Cache
{
    private static Hashtable<String,Shape> shape_map = new Hashtable<String, Shape>();
    public static Shape get_shape(String id)
    {
        Shape cached_shape = shape_map.get(id);
        return (Shape)cached_shape.clone() ;
    }
    public static void load()
    {
        Circle circle = new Circle();
        circle.setId("1");
        shape_map.put(circle.getId(),circle);

        Square square = new Square();
        circle.setId("2");
        shape_map.put(circle.getId(),square);


        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shape_map.put(rectangle.getId(),rectangle);
    }
}
