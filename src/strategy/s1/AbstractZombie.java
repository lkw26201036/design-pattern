package strategy.s1;

/**
 *  僵尸的抽象类
 */
public abstract class AbstractZombie {

    public void display(){
        System.out.println("我是僵尸");
    }

    public void attack() {
        System.out.println("咬");
    }

    public void move() {
        System.out.println("一步一步移动");
    }
}
