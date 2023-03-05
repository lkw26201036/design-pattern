package factory.product;

/**
 * 苹果厂
 */
public class AppleFactory implements FruitFactory{

    @Override
    public Fruit product() {
        return new Apple();
    }
}
