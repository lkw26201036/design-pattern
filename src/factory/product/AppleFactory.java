package factory.product;

/**
 * čšćĺ
 */
public class AppleFactory implements FruitFactory{

    @Override
    public Fruit product() {
        return new Apple();
    }
}
