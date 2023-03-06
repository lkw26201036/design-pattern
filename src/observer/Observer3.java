package observer;

public class Observer3 implements Observer{

    /**
     * 声明响应方式
     */
    @Override
    public void update() {
        System.out.println("Observer3 收到通知");
    }
}
