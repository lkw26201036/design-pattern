package factory.method;

public class CoffeeStore {
    private CoffeeFactory factory;

    public CoffeeFactory getFactory() {
        return factory;
    }

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public CoffeeStore() {
    }

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    // 点咖啡
    public Coffee orderCoffee(){
        // 使用工厂创建咖啡对象
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
