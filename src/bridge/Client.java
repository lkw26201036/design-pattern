package bridge;

/**
 * @author lkw
 */
public class Client {
    public static void main(String[] args) {
        // 苹果笔记本
        Computer computer = new Laptop(new Apple());
        computer.info();
        // 联想台式机
    }
}
