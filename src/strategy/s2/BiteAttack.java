package strategy.s2;

public class BiteAttack implements Attackable{
    @Override
    public void attack() {
        System.out.println("咬");
    }
}
