package observer;

public class Client {
    public static void main(String[] args) {
        // 创建观察者集合
        Subject subject = new Subject();
        // 向观察者集合种添加观察者
        subject.attach(new Observer1());
        subject.attach(new Observer2());
        subject.attach(new Observer3());

        // 向所有观察者发起通知

        subject.notice();

    }
}
