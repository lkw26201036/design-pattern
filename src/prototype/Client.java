package prototype;

import java.util.Date;

/**
 * 浅拷贝
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型对象

        // 创建日期对象
        Date date = new Date();
        // 创建原型对象
        Video v1 = new Video("设计模式",date);
        System.out.println("v1 => " + v1);
        System.out.println("v1.hash => " + v1.hashCode());

        // 克隆一个对象
        Video v2 = (Video) v1.clone();
        // 输出对象
        System.out.println("v2 => " + v2);
        System.out.println("v2.hash => " + v2.hashCode());

        // 修改属性
        date.setTime(1433223);
        // 比较
        System.out.println("v1 => " + v1);
        System.out.println("v2 => " + v2);

    }
}
