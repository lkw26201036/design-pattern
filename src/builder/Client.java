package builder;

public class Client {
    public static void main(String[] args) {
        // 创建一个指挥（包工头）
        Director director = new Director();
        // 包工头指挥工人建造房子
        Product build = director.build(new Worker());
        System.out.println(build.toString());

    }
}
