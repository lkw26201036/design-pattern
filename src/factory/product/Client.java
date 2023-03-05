package factory.product;

public class Client {
    public static void main(String[] args) {
        // 创建苹果工厂
        AppleFactory factory = new AppleFactory();
        Fruit product = factory.product();
        product.sale();
    }
}
