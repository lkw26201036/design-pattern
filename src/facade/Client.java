package facade;

public class Client {
    public static void main(String[] args) {
        // 创建门面对象
        Facade facade = new Facade();
        // 调用门面对象的方法
        facade.print();
    }
}
