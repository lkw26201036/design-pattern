package decorator;

public class GiftTwo extends Gift{
    public GiftTwo(Phone phone) {
        super(phone);
    }

    /**
     * 手机可以聊天
     */
    @Override
    public void chat() {
        super.chat();
        // 在这里进行装饰
        System.out.println("赠送iPods");
    }
}
