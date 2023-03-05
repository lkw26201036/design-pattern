package factory.method;

public class Client {
    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        // 创建拿铁咖啡厂
        store.setFactory(new LotteCoffeeFactory());
        // 点咖啡
        Coffee lotteCoffee = store.orderCoffee();
        System.out.println(lotteCoffee);
    }
}
