package facade;

public class Facade {
    public void print() {
        // 创建三个子系统并调用子系统中的方法

        SubSystem1 subSystem1 = new SubSystem1();
        SubSystem2 subSystem2 = new SubSystem2();
        SubSystem3 subSystem3 = new SubSystem3();

        // 调用子系统中的方法
        subSystem1.print();
        subSystem2.print();
        subSystem3.print();
    }
}
