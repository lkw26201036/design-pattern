package singleton.hungry;

/**
 *  饿汉式:根据jvm的类加载步骤实现线程安全的
 */
public class HungrySingleton {
    // 在初始化阶段给类的静态变量赋初始值
    private static HungrySingleton instance = new HungrySingleton();

    // 提供私有的静态方法是为了不让直接通过new创建对象
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}

class Test {
    public static void main(String[] args) {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1 == instance2); // true
    }
}
