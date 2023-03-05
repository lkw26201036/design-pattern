package singleton.lazy;

/**
 * 懒汉式
 */
public class LazySingleton {
    private volatile static LazySingleton instance; // 加上volatile防止指令重排序

    public LazySingleton() {
    }

    // 创建实例 -- 在多线程的情况下加锁就能保证每个线程在创建对象的时候创建的都是同一实例
    // 但是每次即使对象已经创建，还是synchronized，会影响效率
    // 优化
    /*public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }*/


    public static LazySingleton getInstance() {
        if (instance == null) {
            // 这样每次在实例对象为空的时候才加锁，效率有所提升
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
                return instance;
            }
        }

        return instance;
    }
}

// 测试多线程的环境下对象的实例化情况
class Test{
    public static void main(String[] args) {
        // 创建两个线程，两个线程都实例化一个对象
        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance); // singleton.lazy.LazySingleton@7d383fb
        }).start();

        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance); // singleton.lazy.LazySingleton@7d383fb
        }).start();
        // 经过测试发现，多线程情况下创建的不是同一个对象，解决方法就是在方法的声明上加上synchronized


    }
}
