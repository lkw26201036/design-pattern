package prototype;

import java.util.Date;

public class ShallowClient {
    public static void main(String[] args) {
        // 创建日期对象
        Date date = new Date();
        // 创建原型对象
        ShallowCopy s1 = new ShallowCopy("lkw",20,date);
        // 将该对象赋值给两一个对象
        ShallowCopy s2 = s1;
        // 比较结果
        System.out.println("s1 => " + s1);
        System.out.println("s2 => " + s2);

        // 这个时候修改属性 -- 这个时候发现属性也随之发生了变化
        s1.setAge(21);
        // 修改引用类型的属性
        date.setTime(1314521);
        System.out.println("s1 => " + s1);
        System.out.println("s2 => " + s2);

        // 这个时候发现如果直接进行赋值，那么就是浅拷贝，两个对象指向的是同一个引用
        // 但是修改了引用数据类型，两个对象的引用属性的值还是一样的说明在赋值的时候没有单独开辟空间
        // 要想两个对象完全拷贝就需要进行深拷贝
        System.out.println(s1 == s2); // true  发现两个对象指向同一个地址空间


    }
}
