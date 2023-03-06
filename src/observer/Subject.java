package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类
 */
public class Subject {
    // 定义一个集合存储所有的观察者
    protected List<Observer> observers = new ArrayList<>();
    // 注册方法 -- 用于向观察者集合中添加一个观察者
    public void attach(Observer observer) {
        observers.add(observer);
    }
    // 注销方法 -- 用于在观察者集合中删除一个观察者
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    // 声明抽象的通知方法
    public void notice() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
