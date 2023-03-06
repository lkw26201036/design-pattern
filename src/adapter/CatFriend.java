package adapter;

/**
 * 适配器对象，这个对象继承自目标对象，实现于人类朋友对象
 * 这样这个对象就可以作为人和猫共同的朋友了，那么就可以作为翻译官来把两个不同的物种适配在一起
 */
public class CatFriend extends Cat implements Friend{

    @Override
    public void speak() {
        super.makeSound();
    }
}
