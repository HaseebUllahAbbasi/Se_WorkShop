package Prototype.Implementation;

public abstract class Shape
{
    private  String id;
    protected String type;
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Object clone()
    {
        Object clone =  null;
        try{
            clone = super.clone();
        }
        catch (Exception exp)
        {

        }
        return clone;
    }
}
class Rectangle extends Shape
{
    Rectangle()
    {
        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("inside draw method of rect");
    }
}

class Square extends Shape
{
    Square()
    {
        type = "Square";
    }


    @Override
    void draw() {
        System.out.println("inside draw method of Square");
    }
}

class Circle extends Shape
{
    Circle() {
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("inside draw method of Circle");
    }

}
