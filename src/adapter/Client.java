package adapter;

public class Client {
    public static void main(String[] args) {
        // 创建人类对象
        Person person = new Person();
        // 创建小猫对象
        Friend cat = new CatFriend();
        // 创建小狗对象
        Friend dog = new DogFriend();
        // 任何动物对话
        person.speakTo(cat);
        person.speakTo(dog);
    }
}
