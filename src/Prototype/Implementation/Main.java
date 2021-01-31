package Prototype.Implementation;

public class Main
{
    public static void main(String[] args)
    {
        Shape_Cache.load();
        Shape cloned_shape = (Shape) Shape_Cache.get_shape("1");
        System.out.println(cloned_shape.getType());
        cloned_shape = (Shape) Shape_Cache.get_shape("2");
        System.out.println(cloned_shape.getType());
        cloned_shape = (Shape) Shape_Cache.get_shape("3");
        System.out.println(cloned_shape.getType());
    }
}
