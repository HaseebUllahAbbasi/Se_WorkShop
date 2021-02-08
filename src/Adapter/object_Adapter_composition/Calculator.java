package Adapter.object_Adapter_composition;

public class Calculator implements Calculator_Interface
{

    Rectanlge rectanlge;
    @Override
    public double getArea(Rectanlge rectanlge)
    {
        this.rectanlge = rectanlge;
        return  rectanlge.length * rectanlge.width;
    }

}
