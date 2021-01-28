package Principle_of_design_patterns.Indepency_injection;

interface Service {
    void write(String Message);
}
public class Serice_A implements  Service
{

    @Override
    public void write(String Message) {
        System.out.println("service a message");
    }
}
 class Client_1
{
    Service my_service;
    Client_1(Service service)
    {
        my_service = service;
    }
    void do_something()
    {
System.out.println("do some message");
    }

    public static void main(String[] args) {
            Service service = new Serice_A(); //injector
            Client_1 client_1 = new Client_1(service); // injects the via the cons
        client_1.do_something(); // // calls the service
        client_1.set_service(service);
    }

    private void set_service(Service service)
    {
        my_service = service;
    }


}
