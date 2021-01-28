package Factory_Design.Intro;

public interface Color
{
    void fill();
}
class Red implements Color
{

    @Override
    public void fill() {
            System.out.println("fill od red");
    }
}


class Green implements Color
{

    @Override
    public void fill() {
        System.out.println("fill od Green");
    }
}

class Blue  implements Color
{

    @Override
    public void fill() {
        System.out.println("fill od Blue");
    }
}