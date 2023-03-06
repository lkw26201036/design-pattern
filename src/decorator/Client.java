package decorator;

public class Client {
    public static void main(String[] args) {
        // 不加装饰
        Phone iPhone = new IPhone();
        iPhone.chat();
        // 装饰器一
        Phone phone1 = new GiftOne(new IPhone());
        phone1.chat();
        // 装饰器二
        Phone phone2 = new GiftTwo(new IPhone());
        phone2.chat();

    }
}
