package Factory_Design.Static_imp;


class ShapeFactory
{
    static Shape get_shape(String shape) {
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
