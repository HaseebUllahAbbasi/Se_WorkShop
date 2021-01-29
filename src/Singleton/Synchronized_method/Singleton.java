package Singleton.Synchronized_method;

public class Singleton
{
    // private static
    public static Singleton unique_instance= null;

    // an instance
    private  int data;
    private Singleton() { }
    public static Singleton get_instance()
    {
        if(unique_instance==null)
            unique_instance = new Singleton();
        return unique_instance;
    }

    //by adding synchronized force eacry thread to wait until once the execution is completed
    public static synchronized   void setUnique_instance(Singleton unique_instance)
    {
        unique_instance = unique_instance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData()
    {
        return data;
    }
}

