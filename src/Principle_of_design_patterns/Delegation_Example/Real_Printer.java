package Principle_of_design_patterns.Delegation_Example;

public class Real_Printer
{
    //delegate
    void print()
    {
        System.out.println("the delegate");
    }
}
class Printer
{
    Real_Printer printer = new Real_Printer();
    void display()
    {
        printer.print();
    }
}
