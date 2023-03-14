package strategy.s1;

public class BigHeadZombie extends AbstractZombie{
    @Override
    public void attack() {
        System.out.println("用头撞");
    }

    @Override
    public void display() {
        System.out.println("我是大头僵尸");
    }
}
