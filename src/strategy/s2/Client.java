package strategy.s2;

public class Client {
    public static void main(String[] args) {
        Zombie zombie = new NormalZombie();
        zombie.display();
        zombie.attack();
        zombie.move();

        // 设置攻击方式
        zombie.setAttackable(new HitAttack());
        zombie.attack();
    }
}
