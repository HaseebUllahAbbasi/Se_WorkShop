package Factory_Design.Concrete_Creator;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape_1 = shapeFactory.get_shape("Circle");
        shape_1.draw();
    }
}
