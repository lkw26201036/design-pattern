package adapter;

public class DogFriend extends Dog implements Friend{
    @Override
    public void speak() {
        super.makeSound();
    }
}
