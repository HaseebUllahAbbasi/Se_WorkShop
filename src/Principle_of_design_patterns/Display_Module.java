package Principle_of_design_patterns;

public interface Display_Module
{
    public void display();
}
class Monitor implements  Display_Module
{

    @Override
    public void display()
    {
        System.out.println("display through monitor");
    }
}
class  Projector implements  Display_Module
{

    @Override
    public void display()
    {
        System.out.println("display through the projector");
    }
}
class computer
{
    Display_Module dm ;
    public void set_module(Display_Module module)
    {
        System.out.println(module.toString());
        this.dm = module;
    }

    public void display()
    {
        dm.display();
    }
}