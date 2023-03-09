package bridge;

/**
 * 台式电脑
 */
public class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
