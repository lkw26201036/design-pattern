package factory.product;

/**
 * 香蕉厂
 */
public class BananaFactory implements FruitFactory{
    @Override
    public Fruit product() {
        return new Banana();
    }
}
