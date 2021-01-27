package Principle_of_design_patterns.Indepency_injection;

public class Client
{
    private  Example_Service service;

    Client()
    {
        this.service = new Example_Service();
    }
    String greet()
    {
        return " hello"+ service.get_name();
    }
}
