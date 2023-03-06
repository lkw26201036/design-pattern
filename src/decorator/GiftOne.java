package decorator;

/**
 * 具体装饰器
 */
public class GiftOne extends Gift{

    public GiftOne(Phone phone) {
        super(phone);
    }

    /**
     * 手机可以聊天
     */
    @Override
    public void chat() {
        super.chat();
        // 在这里进行装饰
        System.out.println("送AirPods");
    }
}
