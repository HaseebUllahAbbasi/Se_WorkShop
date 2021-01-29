package Singleton.double_check_locking;

public class Singleton
{
    // data is synchronized through all threads
    public volatile static Singleton unique_instance= null;

    // an instance
    private  int data;
    private Singleton() { }
    public static Singleton get_instance()
    {
        if(unique_instance==null)
        {
            synchronized (Singleton.class)
            {
                if(unique_instance==null)
                    unique_instance = new Singleton();
            }

        }

        return unique_instance;
    }

    //by adding synchronized force eacry thread to wait until once the execution is completed
    public static   void setUnique_instance(Singleton unique_instance)
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

