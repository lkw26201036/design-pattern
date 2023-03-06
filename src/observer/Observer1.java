package observer;

public class Observer1 implements Observer{

    /**
     * 声明响应方式
     */
    @Override
    public void update() {
        System.out.println("Observer1 收到通知");
    }
}
