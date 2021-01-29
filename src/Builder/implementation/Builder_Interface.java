package Builder.implementation;

public interface Builder_Interface
{
    void build_body();
    void inert_wheels();
    void addHeadLight();
    Product getVehicle();
}
class Car implements  Builder_Interface
{
    private  Product product = new Product();

    @Override
    public void build_body() {
        product.add("this is body");

    }

    @Override
    public void inert_wheels() {
        product.add("4 wheels added");

    }

    @Override
    public void addHeadLight() {
            product.add("head light added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
class Moter_Cycle implements  Builder_Interface
{
    private  Product product = new Product();

    @Override
    public void build_body() {
        product.add("build body");
    }

    @Override
    public void inert_wheels() {
        product.add("inserted vehicle");
    }

    @Override
    public void addHeadLight() {
        product.add("added head light");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
