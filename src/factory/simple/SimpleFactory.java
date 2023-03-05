package factory.simple;

/**
 *  简单工厂就是定义一个工厂类，然后工厂类提供了一个静态方法，通过向方法中传参就可以动态创建对象
 *  优点：实现起来简单，可以很少的代码创建多个类
 *  缺点：违背了OCP原则
 */
public class SimpleFactory {
    public static Product getProduct(String type) {
        if ("A".equals(type)) {
            return new A();
        }else {
            return new B();
        }
    }
}

abstract class Product {
    abstract void print();
}

class A extends Product{

    @Override
    void print() {
        System.out.println("产品A");
    }
}

class B extends Product {

    @Override
    void print() {
        System.out.println("产品B");
    }
}
class TestSimpleFactory {
    public static void main(String[] args) {
        Product product = SimpleFactory.getProduct("A");
        product.print();
    }
}
