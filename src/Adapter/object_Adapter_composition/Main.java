package Adapter.object_Adapter_composition;

public class Main
{
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(20,10);

        Calculator_Interface calculator_adapter = new Calculator_Adapter(triangle);

        System.out.println(calculator_adapter.getArea(null));


    }
}
