package Factory_Design.Intro;

public interface Shape
{
    void draw();
}
class Rectangle implements  Shape
{

    @Override
    public void draw() {
        System.out.println("in  draw of rect");
    }
}


class Circle implements  Shape
{

    @Override
    public void draw() {
        System.out.println("in  draw of cir");
    }
}

class Square implements  Shape
{

    @Override
    public void draw() {
        System.out.println("in  draw of sq");
    }
}