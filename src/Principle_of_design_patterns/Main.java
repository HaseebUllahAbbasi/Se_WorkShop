package Principle_of_design_patterns;

import org.omg.PortableServer.POA;

public class Main
{
    public static void main(String[] args) {
        computer com = new computer();
        Display_Module dm = new Monitor();
        Display_Module dm_1 = new Projector();
        com.set_module(dm_1);
        com.display();
        com.set_module(dm);
        com.display();
    }
}
