package strategy.s2;

public abstract class Zombie {

    public Zombie() {
    }

    public Zombie(Moveable moveable, Attackable attackable) {
        this.moveable = moveable;
        this.attackable = attackable;
    }

    public abstract void display();
    Moveable moveable;
    Attackable attackable;
    abstract void move();
    abstract void attack();

    public Moveable getMoveable() {
        return moveable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public Attackable getAttackable() {
        return attackable;
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }
}
