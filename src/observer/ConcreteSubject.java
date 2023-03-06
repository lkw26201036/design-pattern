package observer;

/**
 * 具体的目标类
 */
public class ConcreteSubject extends Subject{
    /**
     * 实现具体的通知方法
     */
    @Override
    public void notice() {
        // 遍历观察者集合，调用每一个观察者的响应方法
        observers.forEach(observer -> {
            observer.update();
        });
    }
}
