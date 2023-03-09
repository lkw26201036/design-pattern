package builder;

/**
 * 抽象的建造者：只提供抽象的方法
 */
public abstract class Builder {
    /**
     * 建造房子的步骤
     */
    abstract void buildA(); // 铺地基
    abstract void buildB(); // 钢筋工程
    abstract void buildC(); // 铺电线
    abstract void buildD(); // 粉刷

    // 最后会生成一个产品

    abstract Product getProduct();
}
