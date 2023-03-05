package factory.method;

public class LotteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LotteCoffee();
    }
}
