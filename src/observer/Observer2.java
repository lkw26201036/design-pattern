package observer;

public class Observer2 implements Observer{

    /**
     * 声明响应方式
     */
    @Override
    public void update() {
        System.out.println("Observer2 收到通知");
    }
}
