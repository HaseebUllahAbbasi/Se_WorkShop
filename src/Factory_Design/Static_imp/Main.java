package Factory_Design.Static_imp;

public class Main
{
    public static void main(String[] args) {
        Shape shape_1 = ShapeFactory.get_shape("Circle");
        shape_1.draw();
    }

}
