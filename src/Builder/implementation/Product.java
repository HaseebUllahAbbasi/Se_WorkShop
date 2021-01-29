package Builder.implementation;

import java.util.LinkedList;
import java.util.Properties;

public class Product
{
    private LinkedList<String> parts;
    public void add(String item)
    {
        parts.add(item);
    }
    Product()
    {
        parts = new LinkedList<String>();
    }
    void show()
    {
        System.out.print("complted the below project");
        for(String item : parts)
        {
            System.out.print(item);
        }
        System.out.println("this is completed ");
    }
}
