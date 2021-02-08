package Adapter.object_Adapter_composition;

public class Calculator_Adapter implements Calculator_Interface
{
    Calculator calculator;
    Triangle triangle;
    @Override
    public double getArea(Rectanlge rectanlge)
    {
        calculator  = new Calculator();
        Rectanlge rectangle_1 = new Rectanlge();
        rectangle_1.length = triangle.base;
        rectangle_1.width = triangle.height*0.5;

        return  calculator.getArea(rectangle_1);


    }
    public Calculator_Adapter(Triangle triangle)
    {
        this.triangle = triangle;

    }

}
