package bridge;

/**
 * 抽象的电脑类
 */
public abstract class Computer {
    // 品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.info();
    }
}
