package adapter;

/**
 * 用于测试的对象
 */
public class Person {
    public void speakTo(Friend friend) {
        System.out.println("人：你在干嘛");
        friend.speak();
    }
}
