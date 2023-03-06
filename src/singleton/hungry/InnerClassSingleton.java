package singleton.hungry;

/**
 *  饿汉式的第二种形式：
 *      使用静态内部类的方式保证线程安全
 */
public class InnerClassSingleton {
    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    // 提供私有的静态方法是为了不让直接通过new创建对象
    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }
}

class TestInnerClass {
    public static void main(String[] args) {
        // 创建两个对象
        // 在调用getInstance方法的时候才调用初始化静态变量
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}