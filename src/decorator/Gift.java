package decorator;

/**
 * 抽象装饰器
 */
public abstract class Gift implements Phone{
    // 要装饰的类
    private Phone phone;

    public Gift(Phone phone) {
        this.phone = phone;
    }

    /**
     * 手机可以聊天
     */
    @Override
    public void chat() {
        // 调用被装饰的类的方法
        phone.chat();
    }
}
