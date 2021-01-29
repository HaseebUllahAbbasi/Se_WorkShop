package Builder.implementation;

public class Director
{
    Builder_Interface builder;
    Director()
    {

    }
    void construct(Builder_Interface builder)
    {
        this.builder = builder;
        this.builder.inert_wheels();
        this.builder.addHeadLight();
        this.builder.build_body();

    }
}
