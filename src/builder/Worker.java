package builder;

/**
 * 具体的建造者
 */
public class Worker extends Builder{

    private Product product;

    public Worker() {
        this.product = new Product();
    }

    /**
     * 建造房子的步骤
     */
    @Override
    void buildA() {
        product.setBuildA("铺地基");
        System.out.println("铺地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
