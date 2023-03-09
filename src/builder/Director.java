package builder;

/**
 * 负责指挥构建一个工程，工程如何构建由他决定
 * 可以调整构建的步骤，这个时候工人只需要按照下发的命令依次执行即可，不需要明白建房子的具体步骤
 */
public class Director {
    /**
     * 指挥工人按照顺序建房子
     * @param builder
     * @return
     */
    public Product build(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
