package prototype;

import java.util.Date;

public class ClientDeep {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 实现深克隆

        // 创建日期对象
        Date date = new Date();
        // 创建原型对象
        VideoDeep v1 = new VideoDeep("设计模式",date);
        System.out.println("v1 => " + v1);
        System.out.println("v1.hash => " + v1.hashCode());


        // 克隆一个对象
        VideoDeep v2 = (VideoDeep) v1.clone();
        // 输出对象
        System.out.println("v2 => " + v2);
        System.out.println("v2.hash => " + v2.hashCode());

        // 修改date属性
        date.setTime(1433223);

        // 比较属性是否都修改了
        System.out.println("v1 => " + v1);
        System.out.println("v2 => " + v2);
    }
}
