package Singleton.double_check_locking;

public class Main
{
    public static void main(String[] args) {

        Singleton s  = Singleton.get_instance();
        s.setData(90);
        System.out.println("the first ref   "+s);
        System.out.println("singleton value is  "+s.getData());

        s = null;
        s = Singleton.get_instance();

        System.out.println("the second ref   "+s);

    }

}
